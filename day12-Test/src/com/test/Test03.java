package com.test;

import java.io.*;

//描述:利用高效字节输出流往C盘下的e.txt文件写出一个字节数组数据，如写出：”i love java”
public class Test03 {
    public static void main(String[] args) {

        //1.利用字节输出流对象创建高效字节输出流对象
        BufferedOutputStream bos = null;
        try {
             bos = new BufferedOutputStream(new FileOutputStream("day12-Test/src/a.txt"));
            // 2.调用高效字节输出流对象的write(byte[] buff)方法写出一个字节数据
            bos.write("i love java".getBytes());
            //3.关闭高效流。
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



}
}
