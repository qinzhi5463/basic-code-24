package com.itheima.String;

public class string_Demo2 {
    /**
     * 字符串遍历的方法1
     */

    public static void main(String[] args) {
        String s1 = "yaoyaoshishader";
        char[] c1 = s1.toCharArray();

        for (int i = 0; i < c1.length; i++) {
            System.out.println(c1[i]);
        }

    }
}
