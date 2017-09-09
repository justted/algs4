package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

public class Exercise1_1_19 {

    private static int M = 100;
    private static long[] fib = new long[M];

    public static long fibonacciOptimization(int N){
        if (N == 0)
            fib[0] = 0;
        else if (N == 1)
            fib[1] = 1;
        else fib[N] = fib[N - 1] + fib[N -2];
        return fib[N];
    }

//    public static long F(int N){
//        if (N == 0) return 0;
//        if (N == 1) return 1;
//        return F(N - 1) + F(N - 2);
//    }

    public static void main(String[] args) {
//        for (int N = 0; N < 100; N++) {
//            StdOut.println(N + " " + F(N));
//        }
        for (int N = 0; N < 100; N++) {
            fib[N] = fibonacciOptimization(N);
            StdOut.println(N + " " + fib[N]);
        }
    }
}
