package com.test03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
以下是某不知名机构评出的全球最佳影片及华人最佳影片前十名 ：
全球
　　1、 《教父》 2、 《肖申克的救赎》3、 《辛德勒的名单》4、 《公民凯恩》5、 《卡萨布兰卡》
　　6、 《教父续集》7、 《七武士》8、 《星球大战》9、 《美国美人》10、 《飞跃疯人院》
华人
　  1、 《霸王别姬》2、 《大闹天宫》3、 《鬼子来了》4、 《大话西游》5、 《活着》
　　6、 《饮食男女》　7、 《无间道》8、 《天书奇谭》9、 《哪吒脑海》10、 《春光乍泄》
1、现将两个榜单中的影片名，分别按排名顺序依次存入两个ArrayList集合
2、通过流的方式
	1）打印全球影片排行榜中的前三甲影片名
	2）打印华人影片排行榜中倒数5名的影片名
	3）将两个排行榜中的前5名挑出来共同存入新的集合
	4）定义电影Film类，以影片名为name创建Film对象并保存至集合

 */
public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("《教父》");
        list1.add("《肖申克的救赎》");
        list1.add("《辛德勒的名单》");
        list1.add("《公民凯恩》");
        list1.add("《卡萨布兰卡》");
        list1.add("《教父续集》");
        list1.add("《七武士》");
        list1.add("《星球大战》");
        list1.add("《美国美人》");
        list1.add("《飞跃疯人院》");
        list2.add("《霸王别姬》");
        list2.add("《大闹天宫》");
        list2.add("《鬼子来了》");
        list2.add("《大话西游》");
        list2.add("《活着》");
        list2.add("《饮食男女》");
        list2.add("《无间道》");
        list2.add("《天书奇谭》");
        list2.add("《哪吒脑海》");
        list2.add("《春光乍泄》");
        list1.stream().limit(3).forEach(s-> System.out.println(s));
        list2.stream().skip(list2.size()-5).forEach(s-> System.out.println(s));
        List<String> list =  Stream.concat(list1.stream().limit(5),list2.stream().limit(5)).collect(Collectors.toList());
        List<Film> filmList = Stream.concat(list1.stream(), list2.stream()).map(Film::new).collect(Collectors.toList());
    }
}
