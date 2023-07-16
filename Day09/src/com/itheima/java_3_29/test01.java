package com.itheima.java_3_29;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] Array=new int[10];
        for (int i = 0; i < Array.length; i++) {
            Array[i]=sc.nextInt();
        }
        for (int i = 0; i < Array.length-1; i++) {
            for (int j = 0; j < Array.length-i-1; j++) {
                if (Array[j]<Array[j+1]){
                    int temp=Array[j+1];
                    Array[j+1]=Array[j];
                    Array[j]=temp;
                }

                }
            }

        for (int j = 0; j < Array.length; j++) {
            System.out.print(Array[j]+" ");

        }
  }
}
