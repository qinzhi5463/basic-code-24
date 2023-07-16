package com.itheima.Test;

import java.util.ArrayList;

public class ArrayList_test01 {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>();
        s.add("张三");
        s.add("刚门吹雪");
        s.add("王五");
        s.add("欧阳坤坤");
        for (int i = 0; i < s.size(); i++) {
            String ret=s.get(i);
            if(ret.length()==4){
                System.out.println(ret);
            }
        }
    }
}
