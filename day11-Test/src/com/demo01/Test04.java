package com.demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//描述:利用字节输入流读取D盘文件a.txt的内容，文件内容确定都为纯ASCII字符
//,使用循环读取，一次读取一个字节，直到读取到文件末尾。将读取的字节输出到控制台
public class Test04 {



    public static void main(String[] args) throws IOException {
        //1.创建字节输入流对象指定文件路径。
        FileInputStream fis = new FileInputStream("h:/a.txt");
        //2.调用read(byte b)方法循环读取文件中的数据
        int len;
        //3.直到读取到-1时结束读取
        while ((len = fis.read())!=-1){
            System.out.println((char)len);

        }
        fis.close();

    }


}
