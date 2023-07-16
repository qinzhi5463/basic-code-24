package com.itheima.StringBuilder;

import java.util.Scanner;

public class fanzhuan {
    public static void main(String[] args) {
        System.out.println("请输入一串字符串：");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();

        StringBuilder s11=new StringBuilder(s1);
        s11.reverse();
        String s2=s11.toString();

        if(s2.equals(s1)){
            System.out.println("该字符串是回文字符串");
        }else{
            System.out.println("不是回文串");
        }


    }
}
