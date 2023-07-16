package com.itheima.java_3_29;

import java.util.Scanner;

public class test02p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        int[] count = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }
        boolean first = true;
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                if (!first) {
                    System.out.print(" ");
                }
                System.out.print((char)(i + 'a') + "=" + count[i]);
                first = false;
            }
        }
        System.out.println();
    }
}
