package org.exercises.java;

import java.util.*;

// provided
class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " " + score;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        int value = o2.score - o1.score;
        if (value == 0) {
            return o1.name.compareTo(o2.name);
        } else {
            return value;
        }
    }
}

public class JavaComparator {
    public static Player[] main(String[] args) {
        int n = Integer.parseInt(args[0]);

        Player[] player = new Player[n];
        Checker checker = new Checker();

        int argIndex = 1;
        for (int i = 0; i < n; i++) {
            player[i] = new Player(args[argIndex], Integer.parseInt(args[argIndex + 1]));
            argIndex += 2;
        }

        Arrays.sort(player, checker);

        return player;
    }

    // HackerRank web portal solution
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
