package com.itheima.Test;

import com.itheima.ArrayList.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_test03 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+(i+1)+"位学生信息：");
            list_add(list);
        }
        for (Student stu : list) {
            System.out.println(stu.getName() + "--------" + stu.getAge());
        }
    }

    private static void list_add(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        Student stu1 = new Student(name, age);
        list.add(stu1);
    }
}
