package com.Test03;
/*
定义经理Manager类继承Employee类，该类具有如下成员:
(1)	属性:职员Clerk(该经理的职员)
(2)	方法:
①	空参数构造方法和满参数构造方法
②	属性的get和set方法
③	重写父类的showMsg方法，方法内先调用父类的showMsg方法，然后打印经理中的职员的名字
 */
public class Manager extends Employee{
    Clerk c ;
    public Manager() {
    }

    public Clerk getC() {
        return c;
    }

    public void setC(Clerk c) {
        this.c = c;
    }

    public Manager(String name, String workId, String dept) {
        super(name, workId, dept);
        this.c = c;

    }

    @Override
    public void showMsg() {
        super.showMsg();
        System.out.println("他的职员是"+ c.getName());
    }
}
