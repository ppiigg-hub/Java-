package com.test01;

import java.util.ArrayList;
import java.util.List;

/*
现在有两个ArrayList 集合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）依次进行以下
    若干操作步骤：
        1. 第一个队伍只要名字为3个字的成员姓名；
        2. 第一个队伍筛选之后只要前3个人；
        3. 第二个队伍只要姓张的成员姓名；
        4. 第二个队伍筛选之后不要前2个人；
        5. 将两个队伍合并为一个队伍；
        6. 打印整个队伍的姓名信息。
 */
public class Test01 {
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
        //使用for循环方式
        //1. 第一个队伍只要名字为3个字的成员姓名；
        List<String> oneA = new ArrayList<>();
        //遍历one，拿到每一个元素，判断名字是否是三个字
        for (String s : one) {
            if(s.length() == 3) {
                oneA.add(s);
            }
        }
        //2. 第一个队伍筛选之后只要前3个人；
        List<String> oneB = new ArrayList<>();
        //遍历oneA，拿到前三个元素，放入到oneB
        for (int i = 0; i < 3; i++) {//i = 0 1 2
            String str = oneA.get(i);
            oneB.add(str);
        }
        //3. 第二个队伍只要姓张的成员姓名；
        List<String> twoA = new ArrayList<>();
        //遍历two，拿到每一个元素判断是否以张开头，如果是以张开头，就放入到twoA
        for (String s : two) {
            if (s.startsWith("张")) {
                twoA.add(s);
            }
        }
        //4. 第二个队伍筛选之后不要前2个人；
        List<String> twoB = new ArrayList<>();
        //遍历twoA，跳过前两个拿到剩下的，添加到twoB中
        for (int i = 2; i < twoA.size(); i++) {
            String str = twoA.get(i);
            twoB.add(str);
        }
        //5. 将两个队伍合并为一个队伍；将oneB和twoB中的内容放入一个新的集合.
        List<String> totalList = new ArrayList<>();
        totalList.addAll(oneB);//将oneB中的所有元素添加到totalList
        totalList.addAll(twoB);//将twoB中的所有元素添加到totalList
        //6. 打印整个队伍的姓名信息。
        for (String s : totalList) {
            System.out.println(s);
        }

    }

}
