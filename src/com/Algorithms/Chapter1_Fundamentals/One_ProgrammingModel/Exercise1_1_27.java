package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

public class Exercise1_1_27 {
    private static int binom_N = 100;

    private static int binom_k = 50;

    private static double[][] binom = new double[binom_N + 1][binom_k + 1];

    private static double binomial(int N, int k, double p) {
        if(N < 0 || k < 0) {
            return 0.0;
        } else if(N == 0 && k == 0) {
            if(binom[N][k] == -1.0)
                binom[N][k] = 1.0;
        } else {
            if (binom[N][k] == -1.0)
                binom[N][k] = (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
        }
        return binom[N][k];
    }

    public static void main(String[] args) {
        // 数组binom初始化
        for(int i = 0; i < binom_N + 1; ++i)
            for(int j = 0; j < binom_k + 1; ++j)
                binom[i][j] = -1.0;
        // 计算概率
        double res = binomial(binom_N, binom_k, 0.25);
        StdOut.println(res);
    }
}
