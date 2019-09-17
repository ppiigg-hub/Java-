package com.demo01;
/*
 *      核心类：ServerSocket
 *          1. 启动服务器 创建ServerSocket类的对象(指定端口号)
 *          3. 调用accept方法负责侦听来自客户端的请求
 *          5. 获得InputStream，读取数据接收来自客户端的请求数据
 *          6. 获得OutputStream，写数据响应服务器的结果到客户端
 *
 */



import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            //1. 启动服务器 创建ServerSocket类的对象(指定端口号)
            ServerSocket serverSocket = new ServerSocket(12345);
            // 3. 调用accept方法负责侦听来自客户端的请求
            Socket server = serverSocket.accept();
            //5. 获得InputStream，读取数据接收来自客户端的请求数据
            InputStream is = server.getInputStream();
            //读数据
            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            System.out.println(new String(bytes,0,len));
            //6. 获得OutputStream，写数据响应服务器的结果到客户端
            OutputStream os = server.getOutputStream();
            os.write("来自服务器端：处理结果。。。。".getBytes());
            os.close();
            is.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
