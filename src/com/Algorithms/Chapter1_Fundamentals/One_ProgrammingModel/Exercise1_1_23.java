package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Exercise1_1_23 {
    //将返回值由int改为boolean
    public static boolean BinaryLookup(int key, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = low + ((high - low) >> 1);
            if(key < arr[mid])
                high = mid - 1;
            else if(key > arr[mid])
                low = mid + 1;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // “ + ” --> 打印出标准输入中不在白名单上的值，
        // “ - ” --> 打印出标准输入中在白名单上的值
        char symbol = '+';
        //readAllInts()返回一个int数组
        int[] whitelist = new In(args[0]).readAllInts();
        Arrays.sort(whitelist);
        //以下使用了Java的重定向IO标准
        FileInputStream file = null;
        try {
            file = new FileInputStream("tinyT.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setIn(file);
        while(!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            boolean found = BinaryLookup(key, whitelist);
            if('+' == symbol && !found)
                StdOut.println(key);
            if('-' == symbol && found)
                StdOut.println(key);
        }
    }
}
