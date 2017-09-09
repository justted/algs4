package com.algs.chapter1.one;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by justted on 2017/9/5.
 */
public class Exercise113 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a == b){
//            if (a == c)
//                StdOut.println("equal");
//            else
//                StdOut.println("not equal");
            StdOut.println(a==c?"equal":"not equal");
        }else {
            StdOut.println("not equal");
        }
    }
}
