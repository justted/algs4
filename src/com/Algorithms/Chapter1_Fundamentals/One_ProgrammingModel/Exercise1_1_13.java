package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

/**
 * Created by justted on 2017/9/6.
 */
public class Exercise1_1_13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StdOut.println("请输入数组的行数和列数：");
        int M = s.nextInt();
        int N = s.nextInt();
        int[][] x = new int[M][N];
        int[][] y = new int[N][M];
        StdOut.println("请输入数组元素：");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                x[i][j] = s.nextInt();
            }
        }
        StdOut.println("你输入的数组为：");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                StdOut.print(x[i][j] + "\t");
            }
            StdOut.println("");
        }
        StdOut.println("转置后的数组为：");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                y[i][j] = x[j][i];
                StdOut.print(y[i][j] + "\t");
            }
            StdOut.println("");
        }

    }
}
