package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise1_1_21 {
    public static void main(String[] args) {
        int M = 3;
        int index = 0;
        String[] strs = new String[M];
        while (!StdIn.isEmpty()){
            while(index < M)
                strs[index++] = StdIn.readLine();
                //i++表示先使用i，再自加1
            for(int i = 0; i < strs.length; ++i) {
                String[] arr = strs[i].split("\\s+");
                //正则表达式,\\d表示 0-9 的数字,\\s表示 空格,回车,换行等空白符,\\w表示单词字符(数字字母下划线),+号表示一个或多个的意思
                double temp = Double.parseDouble(arr[1]) / Double.parseDouble(arr[2]);
                StdOut.printf("%-10s   %-10s   %-10s   %-13.3f\n", arr[0], arr[1], arr[2], temp);
            }
        }

    }
}
