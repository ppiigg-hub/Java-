package com.demo01;

import java.io.FileOutputStream;
import java.io.IOException;

//描述:在D盘下，有一c.txt 文件中内容为：HelloWorld
//在c.txt文件原内容基础上，添加五句 I love java，而且要实现一句一行操作(注：原文不可覆盖)。
//利用字节输出流对象往C盘下c.txt文件输出5句：”i love java”
public class Test03 {

    //2.	调用字节输出流的write()方法写入数据，在每一行后面加上换行符:”\r\n”
    public static void main(String[] args) throws IOException {
        //1.	利用两个参数的构造方法创建字节输出流对象，参数一指定文件路径，参数二指定为true
        FileOutputStream fos = new FileOutputStream("h:/c.txt",true);
        String s = "I love you\n\r";
        for (int i = 0; i <5 ; i++) {
            fos.write(s.getBytes());

        }
        fos.close();

    }
}
