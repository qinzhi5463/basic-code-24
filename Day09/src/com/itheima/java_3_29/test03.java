package com.itheima.java_3_29;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {

        System.out.println("please input n and m value(n>=m)");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        System.out.println(combination(n, m));
    }

    // 计算阶乘的方法

    /**
     * 阶乘考虑用递归计算
     * @param n
     * @return
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // 计算组合数的方法
    public static int combination(int n, int m) {
        return factorial(n) / (factorial(m) * factorial(n - m));
    }
}

