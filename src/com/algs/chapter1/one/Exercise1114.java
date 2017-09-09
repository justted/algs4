package com.algs.chapter1.one;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by justted on 2017/9/6.
 */
public class Exercise1114 {
    public static void main(String[] args) {
        int m = 8;
        int justted = lg(m);
        StdOut.println(justted);
    }

    public static int lg(int N){
        if (N > 0 ){
            //不使用Math库我真的做不到啊
            return (int)(Math.log(N)/Math.log(2));
        }else {
            StdOut.println("不符合对数函数定义域要求");
            return -1;
        }
    }
}
