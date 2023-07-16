package com.itheima.scanner;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ret1 = sc.nextInt();
        sc.nextLine();
        String ret2 = sc.nextLine();

        System.out.println(ret1);
        System.out.println(ret2);
    }
}
