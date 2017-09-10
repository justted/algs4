package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class Exercise1_1_29 {
    public static void main(String[] args) {
        int N = 100;
        int[] arr = new int[N];
        for(int i = 0; i < N; ++i)
            //从数组中随机选择一个数作为key值
            arr[i] = StdRandom.uniform(N*2);
        Arrays.sort(arr);
        StdOut.print("seq = ");
        for(int i = 0 ; i < N; ++i)
            StdOut.print(arr[i] + "\t");
        StdOut.println();
        int key = StdIn.readInt();
        int lowers = countLowers(key, arr);
        StdOut.println("小于\t" + key + "\t的个数是：\t" + lowers);
        int equals = countEquals(key, arr);
        StdOut.println("等于\t" + key + "\t的个数是：\t" + equals);
    }

    private static int countLowers(int key, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = low + ((high - low) >> 1);
            if(key < arr[mid])
                high = mid - 1;
            else if(key > arr[mid])
                low = mid + 1;
            else {
                while(mid > 0 && arr[mid] == arr[mid - 1])              // 注意判断条件的先后顺序,这里取多个重复值的最前面的值
                    -- mid;
                return mid;
            }
        }
        return low;     // -1; 根据算法原理可知low是小于key的个数
    }

    private static int countEquals(int key, int[] arr) {
        int lowers = countLowers(key, arr);
        int idx = lowers;
        if(idx == arr.length || key != arr[idx])                        // 注意判断条件的先后顺序
            return 0;

        int cnt = 1;
        while((idx < arr.length - 1) && (arr[idx] == arr[idx + 1])) {   // 注意判断条件的先后顺序
            ++ cnt;
            ++ idx;
        }
        return cnt;
    }


}
