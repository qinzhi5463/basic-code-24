package com.itheima._encapsulation;

public class studen {
    private int m_age;
    public String m_name;

    public studen(){
        System.out.println("调用构造函数了~");
    }
    public void set(int Age,String Name){
        if(Age>=0&&Age<=120){
            this.m_age=Age;
            this.m_name=Name;
        }else{
            System.out.println("输入不规范！！");
        }
    }

    public int get_age(){
        return m_age;
    }
    public String get_name(){
        return m_name;
    }


}
