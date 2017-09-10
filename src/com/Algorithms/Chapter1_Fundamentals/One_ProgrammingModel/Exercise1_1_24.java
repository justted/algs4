package com.Algorithms.Chapter1_Fundamentals.One_ProgrammingModel;

import edu.princeton.cs.algs4.StdOut;

public class Exercise1_1_24 {

    //此处打印缩进
    private static void printIndents(final int indents) {
        for(int i = 0; i < indents; ++i)
            StdOut.print("----------");
    }

    private static void printCallInfo(int p, int q, int depth) {
        StdOut.print(depth + "\t");
        printIndents(depth);
        StdOut.println(p + "   " + q);
    }

    public static int Euclid(int p, int q, int depth) {
        printCallInfo(p, q, depth);
        if(q == 0)
            return p;
        int r = p % q;
        return Euclid(q, r, depth+1);
    }

    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        int gcd = Euclid(p, q, 0);
        StdOut.println("\n" + p + " 和 " + q + " 的最大公约数是： " + gcd);
        if (gcd == 1){
            StdOut.println("两数互质");
        }
    }
}
