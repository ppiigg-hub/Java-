package com.itheima;

public class Hardware extends Maintain {
    @Override
    public void work() {
        System.out.println("员工号为"+super.getId()+"的 "+super.getName()+"员工，正在修复打印机");
    }
}
