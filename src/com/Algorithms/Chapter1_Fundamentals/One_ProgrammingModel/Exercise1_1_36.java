package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise1_1_36 {
    public interface IShuffle {
        void shuffle(int[] a);
    }

    public static void ShuffleTest(IShuffle shuffle, int m, int n) {
        int[][] s = new int[m][m];
        for (int k = 0; k < n; k++) {
            int[] a = new int[m];
            for (int i = 0; i < m; i++)
                a[i] = i;
            shuffle.shuffle(a);
            for (int i = 0; i < m; i++)
                s[i][a[i]]++;
            }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++)
                StdOut.printf("%7d", s[i][j]);
            StdOut.println();
        }
    }

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        // closure
/*      匿名内部类
        IShuffle shuffle = new IShuffle()
        {
            public void shuffle(int[] a) {
                StdRandom.shuffle(a);
            }
        };*/
        //lambada表达式，这一句相当于得到一个IShuffle子类的一个对象，因为只使用一次，所以为这个对象单独写一个类不划算
        IShuffle shuffle = (int[] a) ->  StdRandom.shuffle(a);
        ShuffleTest(shuffle, m, n);
        StdOut.println(n/m);
    }
}

