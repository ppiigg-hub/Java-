package com.test02;

import java.io.*;

//描述:将test02-Test01中保存到stu.txt文件中的学生对象读取出来。
public class Test02 {
    public static void main(String[] args) {
        //创建字节输入流对象并关联文件
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("day12-Test/src/student.txt");
            //创建对象输入流对象
            ois = new ObjectInputStream(fis);
            //读取学生对象
            Student s = (Student) ois.readObject();
            System.out.println(s);
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
