package com.itheima.java_3_29;

import java.util.Scanner;

public class test03p {
    public static void main(String[] args) {

        System.out.println("please input n and m value(n>=m)");

        Scanner in = new Scanner(System.in);

        int n = in.nextInt(),m = in.nextInt();

        System.out.println(jc(n)/(jc(m)*jc(n-m)));

    }

    private static int jc(int n) {
        if(n==1||n==0){
            return 1;
        }else{
            return n*jc(n-1);
        }
    }
}
