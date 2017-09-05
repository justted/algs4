package com.algs.chapter1.one;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;


/**
 * Created by justted on 2017/9/5.
 */
public class Average {
    public static void main(String[] args) {
        //取StdIn中所有数的平均值
        double sum = 0.0;
        int cnt = 0;
//        以下使用了Java的重定向IO标准，不用这一段的话需要手动输入数据并用ctrl+d刷出
//        FileInputStream file = null;
//        try {
//            file = new FileInputStream("tinyT.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.setIn(file);
        while(!StdIn.isEmpty()){
            //读取一个数并计算累计之和
            sum += StdIn.readDouble();
            cnt++;
        }
        double avg = sum/cnt;
        StdOut.printf("Average is %.5f\n", avg);
    }
}
