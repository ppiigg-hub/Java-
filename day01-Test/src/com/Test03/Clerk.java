package com.Test03;
/*
	属性:经理Manager(该职员的经理)
(2)	方法:
①	空参数构造方法和满参数构造方法
②	属性的get和set方法
③	重写showMsg方法，方法内先调用父类的showMsg方法，然后打印经理的名字
 */
public class Clerk extends Employee{
    Manager m;
    public Clerk() {

    }

    public Clerk(String name, String workId, String dept) {
        super(name, workId, dept);
        this.m = m;
    }

    public Manager getM() {
        return m;
    }

    public void setM(Manager m) {
        this.m = m;
    }

    @Override
    public void showMsg() {
        super.showMsg();
        System.out.println("他的经理是"+ m.getName());
    }
}
