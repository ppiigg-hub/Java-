package com.itheima;
/*
1.	定义类A
2.	定义类B,类B继承A
3.	定义类C,类C继承B
4.	A类中，定义成员变量numa，赋值为10，定义一个方法，方法的名字叫showA
5.	B类中，定义成员变量numb，赋值为20，定义一个方法，方法的名字叫showB
6.	C类中，定义成员变量numc，赋值为30，重写showA方法，打印numa，重写showB方法，打印numb，定义showC方法，打印numc
7.	创建Test测试类，在测试类中创建main方法，在main方法中创建C对象，分别调用showA方法，showB方法，showC方法

 */
public class Test {
    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}
