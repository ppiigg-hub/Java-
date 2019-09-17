package com.demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
描述:
从控制台循环接收用户录入的学生信息，输入格式为：学号-学生名字
将学生信息保存到h盘下面的stu.txt文件中，一个学生信息占据一行数据。
当用户输入end时停止输入。

 */
public class Test02 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的信息，格式为：学号-学生名字");
        // 创建字节输出流对象
        try(FileOutputStream fos =  new FileOutputStream("h:/stu.txt");) {
            // 使用死循环不停的接收用户输入的学生数据
            while(true){
                // 接收用户输入的学生数据
                String line = sc.nextLine();
                // 判断输入的内容是否是end，是则终止循环
                if("end".equals(line)){
                    break;
                }
                // 将数据写出到文件中。
                fos.write(line.getBytes());
                // 写出换行符号
                fos.write(System.lineSeparator().getBytes());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
