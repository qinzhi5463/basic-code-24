package com.itheima.ArrayList;

public class Student {
    private String Name;
    private int Age;

    public Student() {
    }

    public Student(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

    /**
     * 获取
     * @return Name
     */
    public String getName() {
        return Name;
    }

    /**
     * 设置
     * @param Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取
     * @return Age
     */
    public int getAge() {
        return Age;
    }

    /**
     * 设置
     * @param Age
     */
    public void setAge(int Age) {
        this.Age = Age;
    }


}
