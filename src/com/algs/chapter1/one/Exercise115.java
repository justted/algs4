package com.algs.chapter1.one;

/**
 * Created by justted on 2017/9/5.
 */
public class Exercise115 {
    double a = 0.0;
    double b = 1.0;
    public boolean testDouble(Double m){//这里也可以做成一个双参数的方法
        if (a < m && m < b)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        double x = 0.36;
        double y = 0.8;
        Exercise115 e = new Exercise115();
        System.out.println(e.testDouble(x)&&e.testDouble(y));
    }
}
