package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

/**
 * @Author: Justted Chen
 * @Description: 欧几里得算法求最大公约数
 * @Date: Created at 15:21 2018/10/16
 * @Modified By:
 */
public class Gcd {
    public static void main(String[] args) {
        int a = 999;
        int b = 321;
        System.out.println(gcd(a,b));
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        int x = a%b;
        return gcd(b, x);
    }
}
