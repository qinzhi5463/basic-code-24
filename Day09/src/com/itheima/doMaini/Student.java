package com.itheima.doMaini;

public class Student {
    private String Id;
    private String Name;
    private int Age;
    private String Birthday;

    public Student() {
    }

    public Student(String Id, String Name, int Age, String Birthday) {
        this.Id = Id;
        this.Name = Name;
        this.Age = Age;
        this.Birthday = Birthday;
    }

    /**
     * 获取
     * @return Id
     */
    public String getId() {
        return Id;
    }

    /**
     * 设置
     * @param Id
     */
    public void setId(String Id) {
        this.Id = Id;
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

    /**
     * 获取
     * @return Birthday
     */
    public String getBirthday() {
        return Birthday;
    }

    /**
     * 设置
     * @param Birthday
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }


}
