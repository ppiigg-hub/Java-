package com.demo01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//项目需求：请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
// 可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
public class Test07 {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("h:/info.txt");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入你要存储的数字:");
            String s = sc.next();
            if("886".equals(s)){
                break;
            }
            writer.write(s);
            writer.write("\r\n");


        }
        writer.close();
    }
}
