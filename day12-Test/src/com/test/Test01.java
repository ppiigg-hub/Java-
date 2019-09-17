package com.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test01 {
    public static void main(String[] args) {
        //1.创建ArrayList集合对象
        ArrayList<String> arr = new ArrayList<>();
        //2.创建BufferedReader对象，构造方法中传递FileWriter对象
        BufferedReader br = null;
        //3.创建BufferedWriter对象吗，构造方法中传递FileWriter对象
        BufferedWriter bw = null;
        try {
             br = new BufferedReader(new FileReader("day12-Test/src/a.txt"));
             bw = new BufferedWriter(new FileWriter("day12-Test/src/b.txt"));
             //4.使用 BufferedReader对象中的方法read Line，以行的方式读取文本
             String line = null;
             while ((line=br.readLine())!=null){
                 //5.把读取到的文本存储到ArrayList集合中
                 arr.add(line);
             }
             //使用Collections的sort方法对List集合中的数据进行排序
            Collections.sort(arr, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.charAt(0)-o2.charAt(0);
                }
            });
             //将List集合中的数据进行遍历写入到另外一个文件中去
            //6.遍历集合
            for (String s : arr) {
                //7.使用BufferedWriter对象中的write方法，把遍历得到的元素写入到文本中（内存缓冲区中）
                bw.write(s);
                bw.newLine();
            }
            //9.释放资源,先进后关
            bw.close();
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
