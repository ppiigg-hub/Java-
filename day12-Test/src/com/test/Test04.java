package com.test;

import java.io.*;

//描述:利用高效字节输入流和高效字节输出流完成文件的复制。
//要求：
//1.将C盘下的c.png文件复制到D盘下
//2.一次读写一个字节数组方式复制
public class Test04 {
    public static void main(String[] args) {
        //1.利用字节输入流对象创建高效字节输入流对象
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("h:/01.png"));
            //2.利用字节输出流对象创建高效字节输出流对象
            bos = new BufferedOutputStream(new FileOutputStream("g:/02.png"));
            //3.创建字节数组用来存放读取的字节数
            byte[] bytes = new byte[1024];
            // 定义变量接收读取的字节数
            int len ;
            // 循环读取图片数据
            while ((len = bis.read())!=-1){
                // 每读取一个字节的数据就写出到目标文件中
                bos.write(bytes,0,len);

            }
            //关闭高效流对象
            bos.close();
            bis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

}
