package org.exercises.algorithms;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'queensAttack' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER r_q
     *  4. INTEGER c_q
     *  5. 2D_INTEGER_ARRAY obstacles
     */
    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        int queenMoves = getQueenMoves(n, r_q, c_q);

        if (k == 0 || obstacles.isEmpty()) {
            return queenMoves;
        } else {
            int pawnCellsBlocked = getPawnCellsBlocked(n, r_q, c_q, obstacles);
            return queenMoves -  pawnCellsBlocked;
        }
    }

    public static int getQueenMoves(int boardSize, int queenX, int queenY) {
        int upAndDown = (boardSize * 2) - 2;
        int diagonals = (upAndDown) - (Math.abs(queenX - queenY)) - (Math.abs(queenX + queenY - boardSize - 1));

        return upAndDown + diagonals;
    }

    public static int getPawnCellsBlocked(int boardSize, int queenX, int queenY, List<List<Integer>> pawns) {
        // "row column" format
        Set<String> blockedCells = new HashSet<>();

        for (List<Integer> pawn : pawns) {
            int pawnX = pawn.get(0);
            int pawnY = pawn.get(1);
            int finalPawnX = pawnX;
            int finalPawnY = pawnY;

            String location = getLocation(queenX,  queenY, pawnX, pawnY);
            switch (location) {
                case "left":
                    IntStream.range(0, pawnX).map(i-> finalPawnX - i).forEachOrdered(i -> blockedCells.add(finalPawnY + " " + i));
                    break;
                case "right":
                    IntStream.range(pawnX, boardSize+1).forEachOrdered(i -> blockedCells.add(finalPawnY + " " + i));
                    break;
                case "down":
                    IntStream.range(0, pawnY).map(i-> finalPawnY - i).forEachOrdered(i -> blockedCells.add(i + " " + finalPawnX));
                    break;
                case "up":
                    IntStream.range(pawnY, boardSize+1).forEachOrdered(i -> blockedCells.add(i + " " + finalPawnX));
                    break;
                case "upper left":
                    while (pawnY <= boardSize && pawnX > 0) {
                        blockedCells.add((pawnY + " " + pawnX));
                        pawnX -= 1;
                        pawnY += 1;
                    }
                    break;
                case "upper right":
                    while (pawnY <= boardSize && pawnX <= boardSize) {
                        blockedCells.add((pawnY + " " + pawnX));
                        pawnX += 1;
                        pawnY += 1;
                    }
                    break;
                case "lower left":
                    while (pawnY > 0 && pawnX <= boardSize) {
                        blockedCells.add((pawnY + " " + pawnX));
                        pawnX -= 1;
                        pawnY -= 1;
                    }
                    break;
                case "lower right":
                    while (pawnY > 0 && pawnX > 0) {
                        blockedCells.add((pawnY + " " + pawnX));
                        pawnX += 1;
                        pawnY -= 1;
                    }
                    break;
                default:
                    break;
            }
        }

        return blockedCells.size();
    }

    public static String getLocation(int queenX, int queenY, int pawnX, int pawnY) {
        if (pawnY == queenY && pawnX < queenX) {
            return "left";
        }
        if (pawnY == queenY && pawnX > queenX) {
            return "right";
        }
        if (pawnX == queenX && pawnY < queenY) {
            return "down";
        }
        if (pawnX == queenX && pawnY > queenY) {
            return "up";
        }
        if (Math.abs(queenX - pawnX) == Math.abs(queenY - pawnY)) {
            if (pawnY > queenY && pawnX < queenX) {
                return "upper left";
            }
            if (pawnY > queenY && pawnX > queenX) {
                return "upper right";
            }
            if (pawnY < queenY && pawnX < queenX) {
                return "lower left";
            }
            if (pawnY < queenY && pawnX > queenX) {
                return "lower right";
            }
        }

        return "";
    }

}

public class QueensAttackII {
    public static int main(String[] args) {
        String nAndK = args[0];
        String[] split = nAndK.split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);

        String queen = args[1];
        String[] splitQueen = queen.split(" ");
        int r_q = Integer.parseInt(splitQueen[0]);
        int c_q = Integer.parseInt(splitQueen[1]);

        List<List<Integer>> obstacles = new ArrayList<>();
        if (!args[2].isEmpty()) {
            String[] splitObstacle = args[2].split(":");
            for (String s : splitObstacle) {
                ArrayList<Integer> obstacle = new ArrayList<>();
                String[] sSplit = s.split(" ");
                obstacle.add(Integer.parseInt(sSplit[0]));
                obstacle.add(Integer.parseInt(sSplit[1]));
                obstacles.add(obstacle);
            }
        }


        return Result.queensAttack(n, k, r_q, c_q, obstacles);
    }

    // HackerRank web portal solution
    public static void main2(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r_q = Integer.parseInt(secondMultipleInput[0]);

        int c_q = Integer.parseInt(secondMultipleInput[1]);

        List<List<Integer>> obstacles = new ArrayList<>();

        IntStream.range(0, k).forEach(i -> {
            try {
                obstacles.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
