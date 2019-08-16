package com.itheima;
//C类中，定义成员变量numc，赋值为30，重写showA方法，打印numa，重写showB方法，打印numb，定义showC方法，打印numc
public class C extends B{
    int numc = 30;
    public  void showA(){
        System.out.println("A类中的numa:"+numa);
    }
    public void showB(){
        System.out.println("B类中的numb:"+numb);
    }
    public void showC(){
        System.out.println("C类中的numc:"+numc);
    }
}

