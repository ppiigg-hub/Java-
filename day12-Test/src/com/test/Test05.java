package com.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
描述:
分析以下需求，并用代码实现
	实现一个验证码小程序，要求如下：
	1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
	2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败

 */
public class Test05 {
    public static void main(String[] args) throws Exception {
        //键盘录入3个字符串并写入项目根路径下的data.txt文件中
        writeString2File();
        //验证码验证
        verifyCode();
    }
    /**
     * 验证码验证
     * @throws Exception
     */
    private static void verifyCode() throws Exception {
        //创建ArrayList集合，用于存储文件中的3个验证码
        ArrayList<String> list = new ArrayList<>();
        //创建高效字符缓冲输入流对象,并和data.txt文件关联
        BufferedReader br = new BufferedReader(new FileReader(new File("data.txt")));
        String line = null;
        //循环读取每一行
        while(null!=(line = br.readLine())) {
            //将读到的每一行信息存入到list集合中
            list.add(line);
        }
        //关闭流对象
        br.close();
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //提示用户输入验证码
        System.out.println("请输入一个验证码");
        String code = sc.nextLine();
        if(list.contains(code)) {
            System.out.println("验证成功");
        } else {
            System.out.println("验证失败");
        }
    }
    /**
     * 键盘录入3个字符串并写入项目根路径下的data.txt文件中
     * @throws Exception
     */
    private static void writeString2File() throws Exception {
        //创建高效字符缓冲输出流对象并和data.txt文件关联
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("data.txt")));
        String line = null;
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<3;i++) {
            System.out.println("请输入第"+(i+1)+"个字符串验证码");
            //读取用户键盘录入的一行验证码信息
            line = sc.nextLine();
            //将读取到的一行验证码写入到文件中
            bw.write(line);
            //写入换行符
            bw.newLine();
        }
        //关闭流对象
        bw.close();
    }
}



