package com.itheima.Test;

import java.util.Scanner;

public class String_test02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入所需字符串：");
        String s1=sc.nextLine();
        char[] c1=s1.toCharArray();

        int A_w=0;
        int a_w=0;
        int N_w=0;

        for (int i = 0; i < c1.length; i++) {
            if(c1[i]>'a'&&c1[i]<='z'){
                a_w++;
            }else if(c1[i]>'A'&&c1[i]<='Z'){
                A_w++;
            }else if(c1[i]>'0'&&c1[i]<='9'){
                N_w++;
            }
        }
        System.out.println("该字符串中大写字母有"+A_w+"个");
        System.out.println("该字符串中小写字母有"+a_w+"个");
        System.out.println("该字符串中数字有"+N_w+"个");

    }
}
