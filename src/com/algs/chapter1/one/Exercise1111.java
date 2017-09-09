package com.algs.chapter1.one;

import edu.princeton.cs.algs4.StdOut;

import java.util.Random;

/**
 * Created by justted on 2017/9/6.
 */
public class Exercise1111 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean [][] a = new boolean[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++){
                a[i][j] = random.nextBoolean();
                StdOut.println(i + " " + j + " ");
                StdOut.println(a[i][j]);
            }
        }
    }
}
