package com.demo02;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
需求说明：从控制台接收3名学员的信息，每条信息存储到一个Student对象中，将多个Student对象存储到一个集合中。
输入完毕后，将所有学员信息存储到文件Student.txt中。每名学员信息存储一行，多个属性值中间用逗号隔开。

	创建MainApp类，包含main()方法
	在main()方法中：
1)	定义一个存储Student对象的集合；
2)	循环3次，从控制台接收3名学员信息，每条信息封装一个Student对象，将每个Student对象存储到集合中。
3)	遍历集合，获取每个Student对象，取出所有属性值，输出到文件Student.txt中。每名学员信息占一行。

 */
public class Test03 {
    public static void main(String[] args) {
        // 1.定义学生类, 定义存学生的集合
        ArrayList<Student>  list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        // 2.通过3次循环，完成如下操作
        for (int i = 1; i <=3 ; i++) {
            // 键盘输入学生的信息
            System.out.println("请输入学生的学号");
            String id = sc.nextLine();
            System.out.println("请输入学生的姓名");
            String name = sc.nextLine();
            System.out.println("请输入学生的性别");
            String sex = sc.nextLine();
            System.out.println("请输入学生的年龄");
            String age = sc.nextLine();
            // 把信息封装到Student对象中
            Student student = new Student(id, name, sex, age);
            // 把Student对象存到集合里
            list.add(student);
        }
        // 3.将所有学员信息存储到文件Student.txt中。
        try(FileWriter writer = new FileWriter("h:/Student.txt");) {

            // 每名学员信息存储一行，多个属性值中间用逗号隔开。
            for (int i = 0; i < list.size(); i++) {
                // 1.获取集合中每一个学生对象
                Student s =  list.get(i);
                // 2.获取对象中的每一个属性值,多个属性值中间用逗号隔开
                String line = s.getId() + "," + s.getName() + "," + s.getSex() + "," + s.getAge();
                // 3.按照指定的格式把对象的属性值，写入到文件中
                writer.write(line);
                writer.write("\r\n");

            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
