package com.itheima.StringBuilder;

public class chuan_pin_jie {
    public static void main(String[] args) {
        /**
         * 目标生成[0,1,2,3]
         */
        int[] arr0={0,1,2,3};
        test0(arr0);
    }

    public static void test0(int[] arr0) {
        StringBuilder s1=new StringBuilder("[");
        for (int i = 0; i < arr0.length-1; i++) {
            s1.append(arr0[i]).append(",");
        }
        s1.append(arr0[arr0.length-1]).append("]");
        String s2=s1.toString();
        System.out.println(s2);

    }
}
