package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise1_1_32 {
    /**
     * 数据柱状图
     * @param N
     * @param l
     * @param r
     * @param arr
     */
    private static void dataHistogram(int N, double l, double r, double[] arr) {
        int length = arr.length;
        int[] statistics = new int[N];
        double interval = (r - l) / N;
        // 统计数据分布
        for(int i = 0; i < length; ++i) {
            double remain = arr[i] - l;
            int idx = (int)(remain / interval);
            ++ statistics[idx];
        }
        // 查找统计结果中最大值，用于绘制直方图时计算柱状图高时
        double max = statistics[0];
        for(int i = 1; i < statistics.length; ++i) {
            if(max < statistics[i])
                max = statistics[i];
        }
        // 绘制直方图
        StdDraw.setXscale(l, r);
        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        double x0 = l + interval / 2.0;
        for(int i = 0; i < statistics.length; ++i) {
            double x = x0 + i * interval;
            double y = statistics[i] / (max + 1) / 2.0;
            double hw = 0.99 * interval / 2.0;
            double hh = y;
            StdDraw.filledRectangle(x, y, hw, hh);
        }
    }

    public static void main(String[] args) {
        In in = new In("largeW.txt");
        double[] whiteList = in.readAllDoubles();
        double min = Double.POSITIVE_INFINITY;//将min设成正无穷，最大
        double max = Double.NEGATIVE_INFINITY;//将max设成负无穷，最小，很有技巧的设计，从而找到最大和最小数
        for(int i = 0; i < whiteList.length; ++i) {
            if(min > whiteList[i])
                min = whiteList[i];
            if(max < whiteList[i])
                max = whiteList[i];
        }
        // 从控制台读取应该将数据分割的段数
        StdOut.print("将数据分割的段数：");
        int N = StdIn.readInt();//从控制台输入
        //这里至少要加一个大于等于1得数，不然会因为double的精度问题造成interval偏小，idx偏大，从而导致statistics数组溢出
        dataHistogram(N, min, max + 1, whiteList);
    }
}
