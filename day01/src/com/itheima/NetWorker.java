package com.itheima;

public class NetWorker extends Maintain {
    @Override
    public void work() {
        System.out.println("员工号为"+super.getId()+"的 "+super.getName()+"员工，正在检查网络是否畅通");
    }
}
