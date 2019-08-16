package com.itheima;

public class Android extends Developer {

    @Override
    public void work() {
        System.out.println("员工号为"+super.getId()+"的 "+super.getName()+"员工，正在研发某宝手机客户端软件");
    }
}
