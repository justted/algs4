package com.algs.chapter1.one;

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
//                System.out.println("equal");
//            else
//                System.out.println("not equal");
            System.out.println(a==c?"equal":"not equal");
        }else {
            System.out.println("not equal");
        }
    }
}
