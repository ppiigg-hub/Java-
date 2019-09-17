package com.demo01;
/*
描述:利用字节输入流读取D盘文件b.txt的内容，文件内容确定都为纯ASCII字符
,使用循环读取，一次读取一个字节数组，直到读取到文件末尾，将读取到的字节数组转换成字符串输出到控制台。

 */
import java.io.FileInputStream;
import java.io.IOException;

public class Test05 {

    public static void main(String[] args) throws IOException {
        // 创建字节输入流对象并关联文件
        FileInputStream fis = new FileInputStream("h:/b.txt");
        // 定义字节数组存放读取的字节数
        byte[] buffer = new byte[1024];
        // 定义变量接收读取的字节
        int len = -1;
        // 循环从流中读取数据
        while((len = fis.read(buffer)) != -1) {
            System.out.print(new String(buffer,0,len));
        }
        // 关闭流
        fis.close();
    }


}
