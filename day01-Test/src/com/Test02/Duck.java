package com.Test02;
/*
定义普通鸭子类(Duck)
(1)	继承家禽类
(2)	提供空参和带参构造方法
(3)	重写showSymptom方法，打印症状信息
 */
public class Duck extends Poultry {
    public Duck(String name, String symptom, int age, String illness) {
        super(name, symptom, age, illness);
    }

    public Duck() {
    }
    public void showSymprom(){
        System.out.println("入院原因："+super.getIllness());
        System.out.println("症状："+super.getSymptom());
    }
    public void showMsg(){
        System.out.println("动物种类："+super.getName()+","+"年龄"+super.getAge()+"岁");
    }
}
