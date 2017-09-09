package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

public class Exercise1_1_20 {
    public static double ln(int N){
        return Math.log(factorial(N));
    }

    public static long factorial(int M){
        if (M == 0||M == 1)
            return 1;
        else
            return M*factorial(M - 1);
    }

    public static void main(String[] args) {
        double x = ln(4);
        StdOut.println(x);
    }
}
