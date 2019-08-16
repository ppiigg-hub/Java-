package com.Test03;
/*
1.	定义员工Employee类,该类具有如下成员:
(1)	属性：姓名(name,字符串类型)，工号(workId,字符串类型)，部门(dept,字符串类型),属性私有
(2)	方法:
①	空参数构造和满参数构造
②	提供属性的set/get方法
③	定义showMsg方法，方法没有形参，方法的返回值类型是void,方法内打印depart和name和id
2.	定义经理Manager类继承Employee类，该类具有如下成员:
(1)	属性:职员Clerk(该经理的职员)
(2)	方法:
①	空参数构造方法和满参数构造方法
②	属性的get和set方法
③	重写父类的showMsg方法，方法内先调用父类的showMsg方法，然后打印经理中的职员的名字
3.	定义职员Clerk类继承Employee类，该类具有如下成员:
(1)	属性:经理Manager(该职员的经理)
(2)	方法:
①	空参数构造方法和满参数构造方法
②	属性的get和set方法
③	重写showMsg方法，方法内先调用父类的showMsg方法，然后打印经理的名字
4.	创建Test测试类，测试类中创建main方法，main方法中创建经理对象和职员对象，信息分别如下:


设置经理的职员为李小亮，设置职员的经理为张小强

分别调用经理的showMsg方法和职员的showMsg方法

 */
public class Test {
    public static void main(String[] args) {
        // 创建 经理对象
        Manager manager = new Manager("张晓强" , "M001" , "销售部");
        // 创建 职员对象
        Clerk clerk = new Clerk("李小亮" , "C001" , "销售部");
        // 设置职员信息
        manager.setC(clerk);
        // 设置经理信息
        clerk.setM(manager);
        // 展示信息
        manager.showMsg();
        clerk.showMsg();

    }
}
