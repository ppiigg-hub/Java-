package com.demo02;
/*
 文件上传：服务器端
 *          3. 使用输入流读取数据(接收来自客户端的请求数据)
 *          4. 将内存的数据输出到硬盘(处理请求)
 *          5. 使用输出流响应提示信息到客户端
 *
 *		为了保证服务器端能够一直接收来自不同客户端的的请求，我们采用死循环！！！
 */

        import java.io.*;
        import java.net.ServerSocket;
        import java.net.Socket;

public class FileUpload_Server {
    public static void main(String[] args) {
        System.out.println("服务器启动了。。。");
        // 服务器应该一直负责接收来自客户端的请求
        while (true){// 当前这个服务器能够一直接收不同客户端上传的文件！
            //  侦听客户端的请求
            Socket server = null;
            try {
                // 启动服务器
                ServerSocket serverSocket = new ServerSocket(12345);
                server = serverSocket.accept();
                // 3. 使用输入流读取数据(接收来自客户端的请求数据)
                BufferedInputStream bis = new BufferedInputStream(server.getInputStream());
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("h:/"+System.currentTimeMillis()+".gif"));
                // 4. 将内存的数据输出到硬盘(处理请求)
                byte[] bytes = new byte[1024];
                int len;
                while ((len = bis.read(bytes))!=-1){
                    bos.write(bytes,0,len);
                }
                System.out.println("文件接收完毕");
                // 5. 使用输出流响应提示信息到客户端
                OutputStream os = server.getOutputStream();
                os.write("文件上传成功".getBytes());
                //释放资源
                os.close();
                bos.close();
                bis.close();
                // 不需要关闭os，直接关闭server
                server.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
