package com.itheima.java_3_29;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        int[] count = new int[26];
        Scanner sc = new Scanner(System.in);
        String Array = sc.nextLine().toLowerCase();//忽略输入数据的大小写
        for (int i = 0; i < Array.length(); i++) {
            char ch = Array.charAt(i);
            if (Array.charAt(i) >= 'a' && Array.charAt(i) <= 'z') {
                count[ch - 'a']++;
            }
        }


        boolean flag = true;
        for (int j = 0; j < 26; j++) {
            if (count[j] > 0) {
                if (flag == false) {
                    System.out.print(" ");
                }
                System.out.print((char) (97 + j) + "=" + count[j]);
                flag = false;

            }
        }
    }


}
