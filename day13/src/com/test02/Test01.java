package com.test02;

import java.util.stream.Stream;

//有如下7个元素黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，使用Stream将以郭字开头的元素存入新数组
public class Test01 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏");
        stream.filter(s -> s.startsWith("郭")).forEach(s -> System.out.println(s));
    }
}