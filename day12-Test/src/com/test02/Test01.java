package com.test02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
   对象的序列化：
        描述:定义一个学生类，包含姓名，年龄，性别等成员变量，提供setters和getters方法以及构造方法。
        在测试类中创建一个学生对象，给学生对象的三个成员变量赋值。然后将该对象保存到当前项目根目录下的stu.txt文件中。
 */
public class Test01 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",21,"男");
        //Student s2 = new Student("李四",22,"女");
        //Student s3 = new Student("王五",27,"男");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("day12-Test/src/student.txt"));
            oos.writeObject(s1);
            //oos.writeObject(s2);
            //oos.writeObject(s3);
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
