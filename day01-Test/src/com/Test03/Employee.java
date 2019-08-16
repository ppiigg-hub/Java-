package com.Test03;
/*
(1)	属性：姓名(name,字符串类型)，工号(workId,字符串类型)，部门(dept,字符串类型),属性私有
(2)	方法:
①	空参数构造和满参数构造
②	提供属性的set/get方法
③	定义showMsg方法，方法没有形参，方法的返回值类型是void,方法内打印depart和name和id
 */
public class Employee {
    private String name;
    private String workId;
    private String dept;

    public Employee() {
    }

    public Employee(String name, String workId, String dept) {
        this.name = name;
        this.workId = workId;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    //定义showMsg方法，方法没有形参，方法的返回值类型是void,方法内打印depart和name和id
    public void showMsg(){
        System.out.println(dept+"的:"+name+","+"员工编号"+workId);
    }
}
