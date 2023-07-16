package com.itheima.test;

import com.itheima.domain.movie;

import java.util.Scanner;

public class movieService {

    private movie[] arr;

    public movieService(movie[] arr) {
        this.arr = arr;

    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        lo:
        while (true) {
            System.out.println("---------------------");
            System.out.println("请输入您的选择：");
            System.out.println("1、查询全部的电影信息");
            System.out.println("2、根据id查询电影信息");
            System.out.println("3、退出");
            System.out.println("---------------------");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    op1();
                    break;
                case 2:
                    op2();
                    break;
                case 3:
                    System.out.println("退出");
                    break lo;
                default:
                    System.out.println("您的输入有误");
                    break;
            }
        }

    }

    private void op2() {
        System.out.println("请输入所要查询电影的id:");
        Scanner sc = new Scanner(System.in);
        int ret = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            movie m2 = arr[i];
            if (ret == m2.getId()) {
                System.out.println(m2.getTitle() + "----" + m2.getScore() + "----" + m2.getTime() + "----" + m2.getArea() + ".......");
                System.out.println();
                return;
            }
        }

        System.out.println("没有查到所要查的电影信息！！");
    }

    private void op1() {
        for (int i = 0; i < arr.length; i++) {
            movie m1 = arr[i];
            System.out.println(m1.getTitle() + "----" + m1.getScore());
            System.out.println();

        }
    }
}
