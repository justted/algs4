package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by justted on 2017/9/6.
 */
public class Exercise1_1_15 {

    public static int[] histogram(int[] a, int M){
        //初始化一个数组，默认各项全部为零
        int[] h = new int[M];
        int N = a.length;

        for (int i = 0; i < N; i++)
            //本例中参数数组各项的范围大小就是返回数组的容量大小
            //如果a[i]项小于M，那么h[a[i]]项自增1
            if (a[i] < M)
                h[a[i]]++;
        return h;
    }

    public static void main(String[] args){
        int N = 40;
        int M = 11;
        int[] a = new int[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.uniform(M);
        for (int i = 0; i < N; i++)
            //格式化打印输出参数数组
            StdOut.printf("%3d", a[i]);
        int[] h = histogram(a, M);
        StdOut.println("\n");
        for (int i = 0; i < M; i++)
            StdOut.printf("%4d", h[i]);
    }

}