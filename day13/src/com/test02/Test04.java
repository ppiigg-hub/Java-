package com.test02;

import java.util.ArrayList;
import java.util.stream.Stream;

//已知数组arr1中有如下元素{郭靖，杨康}，arr2中有如下元素{黄蓉，穆念慈}，使用Stream将二者合并到List集合
public class Test04 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("郭靖","杨康");
        Stream<String> stream2 = Stream.of("黄蓉","穆念慈");
        Stream.concat(stream1,stream2).forEach(s -> System.out.println(s));

    }
}
