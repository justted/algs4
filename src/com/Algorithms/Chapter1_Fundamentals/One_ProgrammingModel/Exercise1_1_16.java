package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by justted on 2017/9/6.
 */
public class Exercise1_1_16 {
    public static String exR1(int n){
        if (n <= 0){
            return "";
        }
        return exR1(n-3) + n + exR1(n - 2) + n;
    }

    public static void main(String[] args) {
        String s = exR1(6);
        StdOut.println(s);
        //311361142246
    }
}
