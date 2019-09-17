package com.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*

 *      核心类： Socket
 *          2. 创建Socket类的对象(指定服务器的主机和端口号)
 *          4. 获得OutputStream，写数据向服务器端发送请求
 *          7. 获得InputStream，读数据接收来自服务器端的响应数据
 *          8. 关闭资源
 *          简单的TCP程序
 */
public class Client {
    public static void main(String[] args) {
        try {
            //2. 创建Socket类的对象(指定服务器的主机和端口号)
            Socket client = new Socket("localhost",1234);
            //4. 获得OutputStream，写数据向服务器端发送请求
            OutputStream os = client.getOutputStream();
            os.write("来自客户端：服务器端我来了。。。".getBytes());
            //7. 获得InputStream，读数据接收来自服务器端的响应数据
            InputStream is = client.getInputStream();
            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            System.out.println(new String(bytes,0,len));
            //8. 关闭资源
            is.close();
            os.close();
            client.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
