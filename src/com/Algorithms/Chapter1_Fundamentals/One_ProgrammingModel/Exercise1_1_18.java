package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by justted on 2017/9/6.
 */
public class Exercise1_1_18 {
    public static  int mystery(int a, int b){
        if (b == 0)
            //return 0;
            return 1;
        if (b%2 == 0)
            //return mystery(a+a, b/2);
            return mystery(a*a, b/2);
        //return mystery(a+a, b/2) + a;
        return mystery(a*a, b/2) * a;
    }

    public static void main(String[] args) {
        int a = mystery(2, 25);
        int b = mystery(3, 11);
        StdOut.println(a);
        StdOut.println(b);
    }
}
