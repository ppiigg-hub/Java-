package com.demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
在h盘下有一个文本文件test.txt(里面的内容由数字和字母组成)
定义一个方法统计test.txt文件中’a’字符出现的次数。
比如a字符在文件中出现了10次则调用方法传入a后，方法内部输出：a出现10次

 */
public class Test01 {
    public static void main(String[] args) {
        calcuteCount('a');
    }
    public static void calcuteCount(char ch){

        try(FileInputStream fis = new FileInputStream("h:/test.txt")) {

            int len;
            int count = 0;
            while ((len=fis.read())!=-1){
                if(len==ch){
                    count++;
                }
            }
            System.out.println(ch+"出现了"+count+"次");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
