package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class Exercise1_1_22 {

    //递归二分法找到有序数组中对应key值的数
    public static int rank(int key, int[] a, int lo, int hi, int depth){
        printCallInfo(lo, hi, depth);
        if (lo > hi) return -1;
        int mid = lo + ((hi - lo) >> 1);  //>>是移位操作符，这里的效果相当于除以2
        if(key < a[mid]) return rank(key, a, lo, mid - 1, depth + 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, depth + 1);
        else return mid;
    }

    public static int binarySearch(int key, int[] arr, int depth) {
        return rank(key, arr, 0, arr.length - 1, depth);
    }

    private static void printCallInfo(int low, int high, int depth) {
        StdOut.print(depth + "\t");  //\t是转义后的tab键
        printIndent(depth);
        StdOut.println(low + "\t" + high);
    }

    private static void printIndent(final int indents) {
        for(int i = 0; i < indents; ++i)
            StdOut.print("----------");
    }

    public static void main(String[] args) {
        int N = 1024;
        int[] arr = new int[N];
        for(int i = 0; i < N; ++i)
            //从数组中随机选择一个数作为key值
            arr[i] = StdRandom.uniform(N * 50);
        Arrays.sort(arr);
        StdOut.print("seq = ");
        for(int i = 0 ; i < N; ++i)
            StdOut.print(arr[i] + "\t");
        int key = arr[StdRandom.uniform(N)];
        StdOut.println("\nkey = " + key);
        StdOut.println("---------------------------------------------------------------------------------------");
        binarySearch(key, arr, 0);
        StdOut.println(binarySearch(key, arr, 0));
    }
}
