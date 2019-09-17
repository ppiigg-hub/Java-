package com.demo02;

import java.io.*;
import java.net.Socket;

/*
文件上传：客户端
 *          1. 使用输入流读取硬盘的文件数据到内存
 *          2. 使用输出流写出内存的数据到服务器端(发送请求)
 *          6. 使用输入流读取来自服务器端响应的数据(提示信息)
 */
public class FileUpload_Client {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost",12345);
            //1. 使用输入流读取硬盘的文件数据到内存
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day14-code/src/feiji.gif"));
            //2. 使用输出流写出内存的数据到服务器端(发送请求)
            BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes))!=-1){
                bos.write(bytes,0,len);
            }
            // 控制台提示信息
            System.out.println("客户端文件上传成功");
            // 6. 使用输入流读取来自服务器端响应的数据(提示信息)
            InputStream is = client.getInputStream();
            byte[] back = new byte[1024];
            int len1 = is.read(bytes);
            System.out.println(new String(bytes,0,len1));
            //释放资源

            bos.close();
            bis.close();
            is.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
