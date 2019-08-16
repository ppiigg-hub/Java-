package com.itheima;

public class Test {
    public static void main(String[] args) {
        JavaEE javaEE = new JavaEE();
        javaEE.setId("001");
        javaEE.setName("张三");
        javaEE.work();
        Android android = new Android();
        android.setId("002");
        android.setName("李四");
        android.work();
        NetWorker netWorker = new NetWorker();
        netWorker.setId("003");
        netWorker.setName("王五");
        netWorker.work();
        Hardware hardware = new Hardware();
        hardware.setId("004");
        hardware.setName("小二");
        hardware.work();
    }
}
