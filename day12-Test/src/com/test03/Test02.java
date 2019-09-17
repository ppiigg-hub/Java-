package com.test03;

import java.io.*;
import java.util.ArrayList;

/*
描述:
项目根路径下有text.txt文件，内容如下：
	我爱黑马
	123456
利用IO流的知识读取text.txt文件的内容反转后写入text1.txt文件中，内容如下：
	123456
    我爱黑马

 */
public class Test02 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //读取关联文件
        try {
            BufferedReader br = new BufferedReader(new FileReader("day12-Test/src/test.txt"));
            String line;
            while ((line = br.readLine())!=null){
                //每读取一行放入集合
                list.add(line);
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter("day12-Test/src/test2.txt"));
            for (int i = 0; i < list.size(); i++) {
                //逐行写入
                bw.write(list.get(i));
                bw.newLine();
                bw.flush();
            }
            bw.close();
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
