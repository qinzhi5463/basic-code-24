package com.itheima.Test;

import com.itheima.ArrayList.Student;

import java.util.ArrayList;

public class ArrayList_test04 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        list.add(new Student("张三",56));
        list.add(new Student("李四",16));
        list.add(new Student("王五",15));

        ArrayList<Student> newList =  filter(list);
        for (int i = 0; i < newList.size(); i++) {
            Student stu1=newList.get(i);
            System.out.println(stu1.getName()+"----------"+stu1.getAge());
        }

    }

    private static ArrayList<Student> filter(ArrayList<Student> list) {
        ArrayList<Student> retList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            if(stu.getAge()<18){
                retList.add(stu);
            }
        }
        return retList;
    }
}
