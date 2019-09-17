package com.demo01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//描述:利用字节输出流一次写一个字节的方式，向D盘的a.txt文件输出字符‘a’。
public class Test01 {
    public static void main(String[] args) throws IOException {
        //1.	创建字节输出流FileOutputStream对象并指定文件路径。
        FileOutputStream fos = new FileOutputStream("h:/a.txt");
        //2.	调用字节输出流的write(int byte)方法写出数据
        fos.write(97);
        fos.close();
    }
}
