package org.assessments;

import java.util.*;

public class Codility {
    public static int solution1(int N, int K) {
        if (K == 0) return 0;
        if (K < 0 || N == 0) return -1;

        int maxSum = N * (N + 1) / 2;
        if (K > maxSum) return -1;

        int[] arr = new int[K + 1];

        for (int i = 1; i <= K; i++) {
            arr[i] = Integer.MAX_VALUE;
        }

        arr[0] = 0;
        arr[1] = 1;

        for (int glass = 1; glass <= N; glass++) {
            for (int sum = K; sum >= glass; sum--) {
                if (arr[sum - glass] != Integer.MAX_VALUE) {
                    arr[sum] = Math.min(arr[sum], arr[sum - glass] + 1);
                }
            }
        }

        return arr[K] == Integer.MAX_VALUE ? -1 : arr[K];
    }

    public static int[] solution2(int N) {
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            output.add(getRandomNumber(10, 100));
        }
        return  output.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int practiceSolution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int x: A) {
            if (x > 0) {
                set.add(x);
            }
        }

        for (int x = 1; x <= set.size() + 1; x++) {
            if (!set.contains(x)) {
                return x;
            }
        }

        return set.size() + 1;
    }

    public static int find_min(int[] A) {
        int ans = 0;
        for (int i = 1; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }
}
