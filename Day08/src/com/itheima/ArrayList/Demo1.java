package com.itheima.ArrayList;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Double> list1=new ArrayList<>();
        list1.add(11.1);
        list1.add(22.2);
        list1.add(33.3);

        ArrayList<String> list2=new ArrayList<>();
        list2.add("张三");
        list2.add("李四");
        list2.add("王五");

        System.out.println(list1);
        System.out.println(list2);
    }
}
