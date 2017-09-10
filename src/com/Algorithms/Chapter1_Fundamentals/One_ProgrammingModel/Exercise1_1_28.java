package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercise1_1_28 {

    public static int countRepeated(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < (arr.length - 1); ++i)
            if (arr[i + 1] == arr[i])
                ++ cnt;
        return cnt;
    }

    public static int[] copy(int[] original, int repeatedCnt) {
        int[] res = new int[original.length - repeatedCnt];
        int cntIdx = 0;
        res[cntIdx ++] = original[0];
        for(int i = 1; i < original.length; ++i)
            //如果元素重复，直接跳过，继续循环
            if(original[i] == original[i-1])
                continue;
            else
                //不然就将最新的值赋予新数组
                res[cntIdx ++] = original[i];
        return res;
    }

    public static void main(String[] args) {
        int[] whitelist = new In(args[0]).readAllInts();
        // 白名单排序并输出
        Arrays.sort(whitelist);
        for(int i = 0; i < whitelist.length; ++i)
            StdOut.print(whitelist[i] + "\t");
        StdOut.println();
        // 统计重复元素个数并去重
        int cnt = countRepeated(whitelist);
        int[] res = copy(whitelist, cnt);
        // 输出去重后的数组
        for(int i = 0; i < res.length; ++i)
            StdOut.print(res[i] + "\t");
    }
}
