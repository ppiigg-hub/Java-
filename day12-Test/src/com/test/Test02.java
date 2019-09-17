package com.test;

//描述:利用高效字节输出流往C盘下的d.txt文件输出一个字节数。

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) {
        //1.利用字节输出流对象创建高效字节输出流对象
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("day12-Test/src/a.txt"));
            //2.调用高效字节输出流对象的write方法写出一个字节.
            bw.write(97);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //3.关闭高效流，释放资源。

    }

}
