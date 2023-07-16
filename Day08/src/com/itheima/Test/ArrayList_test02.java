package com.itheima.Test;

import com.itheima.ArrayList.Student;

import java.util.ArrayList;

public class ArrayList_test02 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 21);
        Student stu2 = new Student("李四", 26);
        Student stu3 = new Student("王五", 56);

        ArrayList<Student> List = new ArrayList<>();
        List.add(stu1);
        List.add(stu2);
        List.add(stu3);
        System.out.println("年龄小于30的人有：");
        for (int i = 0; i < List.size(); i++) {
            Student ret = List.get(i);
            if (ret.getAge() <= 30) {
                System.out.println(ret.getName());

            }

        }
    }
}
