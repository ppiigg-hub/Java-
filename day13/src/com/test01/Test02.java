package com.test01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
    现在有两个ArrayList 集合存储队伍当中的多个成员姓名，要求使用Stream流依次进行以下
    若干操作步骤：
        1. 第一个队伍只要名字为3个字的成员姓名；
        2. 第一个队伍筛选之后只要前3个人；
        3. 第二个队伍只要姓张的成员姓名；
        4. 第二个队伍筛选之后不要前2个人；
        5. 将两个队伍合并为一个队伍；
        6. 打印整个队伍的姓名信息。
 */
public class Test02 {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("孙子");
        one.add("洪七公");
        one.add("欧阳锋");
        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");
        //使用stream流的方式
        //1.第一个队伍只要名字为三个字的成员，然后在第一次的基础上筛选出前三个人
        Stream<String> onestream = one.stream().filter(s -> s.length() == 3).limit(3);
        //2.第二个队伍只要姓张的成员姓名,第二个队伍筛选之后不要前2个人；
        Stream<String> twostream = two.stream().filter(s -> s.startsWith("张")).skip(2);
        //将两个队伍合并成为一个队伍并打印
        Stream.concat(onestream,twostream).forEach(s-> System.out.println(s));

    }

}
