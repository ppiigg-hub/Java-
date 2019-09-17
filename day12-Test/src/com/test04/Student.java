package com.test04;

import java.io.Serializable;

//定义一个学生类，成员变量有姓名，年龄，性别，提供setters和getters方法以及构造方法
public class Student implements Serializable {
    private static final long serialVersionUID = -5138981197784281936L;
    private String name;
    private int age;
    private String gender;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
