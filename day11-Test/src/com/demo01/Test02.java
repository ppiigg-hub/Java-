package com.demo01;

import java.io.FileOutputStream;
import java.io.IOException;

//描述:利用字节输出流一次写一个字节数组的方式向D盘的b.txt文件输出内容:"i love java"
public class Test02 {
    public static void main(String[] args) throws IOException {
        //1.创建字节输出流FileOutputStream对象并指定文件路径。
        FileOutputStream fos = new FileOutputStream("h:/b.txt");
        //2.调用字节输出流的write(byte[] buf)方法写出数据。
        byte[] bytes = "I love you".getBytes();
        fos.write(bytes);
        fos.close();

    }
}
