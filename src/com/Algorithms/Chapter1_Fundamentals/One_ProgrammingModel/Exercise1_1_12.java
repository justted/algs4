package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by justted on 2017/9/6.
 */
public class Exercise1_1_12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
            //StdOut.println(a[i]);
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
            //StdOut.println(a[i]);
        }
        for (int i = 0; i < 10; i++) {
            StdOut.println(i);
        }
    }
}
