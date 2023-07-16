package com.itheima.test;

import com.itheima._encapsulation.studen;

public class encapsulation {
    public static void main(String[] args) {
        studen st1=new studen();
        studen st2=new studen();
        st1.set(22,"赵国名");
        st2.set(25,"王琪");

        int age1=st1.get_age();
        String name1=st1.get_name();
        System.out.println(age1+"----"+name1);

        st2.m_name="王签";
        int age2=st2.get_age();
        String name2=st2.get_name();
        System.out.println(age2+"----"+name2);

    }
}
