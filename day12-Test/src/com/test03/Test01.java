package com.test03;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

//描述:从键盘录入一行字符串，利用字节打印流将该行字符串保存到当前项目根目录下的d.txt文件中
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符串:");
        //接收用户输入的数据
        String line = sc.nextLine();
        //创建字节打印流对象
        try {
            PrintStream ps = new PrintStream("day12-Test/src/c.txt");
            //将字符串才写出到文件中
            ps.print(line);
            //关闭
            ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
