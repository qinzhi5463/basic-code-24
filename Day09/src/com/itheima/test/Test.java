package com.itheima.test;

import com.itheima.doMaini.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        ArrayList<Student> stu_list = new ArrayList<>();

      /*  Student stu1=new Student("bai0","张三",56,"2000-12-12");
        Student stu2=new Student("bai1","李四",55,"2000-12-12");
        Student stu3=new Student("bai2","王五",21,"2000-12-12");

        stu_list.add(stu1);
        stu_list.add(stu2);
        stu_list.add(stu3);
*/

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("------1、添加学生-------------");
            System.out.println("------2、删除学生-------------");
            System.out.println("------3、修改学生-------------");
            System.out.println("------4、查看学生-------------");
            System.out.println("------5、退出----------------");
            System.out.println("------请输入您的选择：---------");


            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent(stu_list);
                case 2 -> deleteStudentById(stu_list);
                case 3 -> updateStudentById(stu_list);
                case 4 -> queryStudentInfos(stu_list);
                case 5 -> {
                    System.out.println("退出系统");
                    System.exit(0);
                }
                default -> System.out.println("输入有误,请重新输入");
            }
        }

    }

    private static void addStudent(ArrayList<Student> stuList) {
        Scanner sc = new Scanner(System.in);

        String id;
        while (true) {
            System.out.println("请输入学生编号：");
            id = sc.next();
            int ret = getIndex(id, stuList);
            if (ret == -1) {
                break;
            } else {
                System.out.println("该学号已被占用，请重新输入");
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生生日：");
        String birthday = sc.next();
        Student stu = new Student(id, name, age, birthday);


        stuList.add(stu);
        System.out.println("添加成功！");
    }


    private static void updateStudentById(ArrayList<Student> stuList) {
        System.out.println("请输入要修改学生的编号：");
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int retNum = getIndex(num, stuList);
        if (retNum == -1) {
            System.out.println("学生数据库中不存在该学生，修改失败");
        } else {
            System.out.println("请输入新的学生姓名：");
            String name = sc.next();
            System.out.println("请输入新的学生年龄：");
            int age = sc.nextInt();
            System.out.println("请输入新的学生生日：");
            String birthday = sc.next();
            Student stu = new Student(num, name, age, birthday);
            stuList.set(retNum, stu);
            System.out.println("修改成功！");
        }
    }

    /**
     * 删除一名学生的信息
     *
     * @param stuList
     */
    private static void deleteStudentById(ArrayList<Student> stuList) {
        System.out.println("请输入要删除学生的编号：");
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int retNum = getIndex(num, stuList);
        if (retNum == -1) {
            System.out.println("学生数据库中不存在该学生，删除失败");
        } else {
            stuList.remove(retNum);
            System.out.println("删除成功");

        }
    }

    /**
     * 跟据用户输入的学号，来找出该学生在集合中的编号
     *
     * @param num
     * @param stuList
     * @return
     */
    private static int getIndex(String num, ArrayList<Student> stuList) {

        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            if (stu.getId().equals(num)) {
                return i;
            }
        }
        return -1;
    }

    private static void queryStudentInfos(ArrayList<Student> stuList) {
        if (stuList.size() == 0) {
            System.out.println("暂无学生信息，请输入信息后再查看");
        } else {
            for (Student stu : stuList) {
                System.out.println(stu.getId() + "---" + stu.getName() + "---" + stu.getAge() + "---" + stu.getBirthday());

            }
        }
    }

}
