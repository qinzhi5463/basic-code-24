package com.itheima.Test;

import java.util.Scanner;

public class String_test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mysql = "admin";
        String password = "123456";


        for (int i = 1; i < 4; i++) {
            System.out.println("请输入账户名：");
            String m1 = sc.nextLine();

            System.out.println("请输入账户密码：");
            String p1 = sc.nextLine();
            if (m1.equals(mysql) && p1.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if(i==3){
                    System.out.println("登录失败，请明天再重试");
                    return;
                }
                System.out.println("登录失败，剩余"+(3-i)+"次机会");
            }
        }

    }
}
