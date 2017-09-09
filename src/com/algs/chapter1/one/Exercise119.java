package com.algs.chapter1.one;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by justted on 2017/9/5.
 */
public class Exercise119 {
    public static void main(String[] args) {
        int N = 54;
        String s = Integer.toBinaryString(N);
        StdOut.println(s);

        String s1 = "";
        for (int n = N; n > 0; n/=2)
            s1 = (n%2)+s1;
        StdOut.println(s1);
    }
}
