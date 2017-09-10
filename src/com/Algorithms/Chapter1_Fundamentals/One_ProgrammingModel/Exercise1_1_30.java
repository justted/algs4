package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

public class Exercise1_1_30 {
    public static int gcd(int M, int N){
        if (N == 0){
            return M;
        }
        int R = M%N;
        return gcd(N, R);
    }

    private static boolean[][] boolArray(int N){
        boolean[][] boolArray = new boolean[N][N];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (gcd(i, j) == 1)
                    boolArray[i-1][j-1] = true;
            }
        }
        return boolArray;
    }

    public static void main(String[] args) {
        int N = 5;
        boolean[][] boolArray = boolArray(N);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                StdOut.print(boolArray[i][j] + "\t");
            }
            StdOut.println();
        }
    }
}
