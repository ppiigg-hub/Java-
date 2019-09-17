package com.test02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

//请分别写出获取并发流的两种方式。
public class Test05 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        Stream<String> parallelStream1 = coll.parallelStream();
        Stream<Integer> parallelStream2 = Stream.of(100, 200, 300, 400).parallel();

    }
}
