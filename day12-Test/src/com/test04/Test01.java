package com.test04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
描述:
定义一个学生类，成员变量有姓名，年龄，性别，提供setters和getters方法以及构造方法
定义一个测试类，在测试类创建多个学生对象保存到集合中，然后将集合存储到当前项目根目录下的stus.txt文件中。

 */
public class Test01 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三",21,"男");
        Student s2 = new Student("李四",22,"女");
        Student s3 = new Student("王五",27,"男");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day12-Test/src/stus.txt"));
            oos.writeObject(list);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
