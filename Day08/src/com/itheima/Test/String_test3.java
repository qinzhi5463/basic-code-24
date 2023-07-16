package com.itheima.Test;

import java.util.Scanner;

public class String_test3 {
    public static void main(String[] args) {
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一串电话号码：");
        String Phone_Num=sc.nextLine();
        String s1=Phone_Num.substring(0,3);//19836075463
        String s2=Phone_Num.substring(7);
        System.out.println("隐藏后的号码为：");
        System.out.println(s1+"****"+s2);*/

        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一串电话号码：");
        String Phone_Num=sc.nextLine();
        char[] c1=Phone_Num.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if(i>=3&&i<=6){
                System.out.print("*");
            }else {
                System.out.print(c1[i]);
            }

        }*/


        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一句话：");
        String Phone_Num=sc.nextLine();
        String ret=Phone_Num.replace("TMD","***");
        System.out.println("优化后的话为："+ret);

    }
}
