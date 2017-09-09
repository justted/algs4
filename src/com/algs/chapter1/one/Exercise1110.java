package com.algs.chapter1.one;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by justted on 2017/9/5.
 */
public class Exercise1110 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i*i;
            StdOut.println(a[i]);
        }
    }
}
