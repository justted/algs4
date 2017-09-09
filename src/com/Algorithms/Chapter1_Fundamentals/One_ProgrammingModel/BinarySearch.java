package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 * Created by justted on 2017/9/5.
 */
public class BinarySearch {
    //二分法找到有序数组中对应key值的数
    public static int rank(int key, int[] a){
        int lo = 0;
        int hi = a.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return  -1;
    }

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);//这里表示API中提示只是一个过时的方法
        Arrays.sort(whitelist);
        //以下使用了Java的重定向IO标准
        FileInputStream file = null;
        try {
            file = new FileInputStream("tinyT.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setIn(file);
        while (!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if (rank(key, whitelist) == -1)
                StdOut.println(key);
        }
    }
}
