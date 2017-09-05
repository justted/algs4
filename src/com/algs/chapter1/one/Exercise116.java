package com.algs.chapter1.one;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by justted on 2017/9/5.
 */
public class Exercise116 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15 ; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
