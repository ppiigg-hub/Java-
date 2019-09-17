package com.demo01;
/*
    描述:利用字节流将E盘下的a.png图片复制到D盘下(文件名保存一致)
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test06 {
    public static void main(String[] args) throws IOException {
        //1.创建字节输入流对象关联文件路径：E盘下的a.png

        FileInputStream fis = new FileInputStream("h:/feiji.gif");
        //2.创建字节输出流对象关联文件路径：D盘下的a.png

        FileOutputStream fos = new FileOutputStream("g:/dafeiji.gif");
        //3.使用循环不断从字节输入流读取一个字节，每读取一个字节就利用输出流写出一个字节。
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        //4.关闭流，释放资源
        fos.close();
    }

}
