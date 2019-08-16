package com.Test04;

import java.util.ArrayList;

/*
定义购物车GouWuChe类，具有如下成员
(1)	成员属性:
①	创建ArrayList<Goods>集合
(2)	方法
①	空参数构造方法和满参数构造方法
②	定义添加方法的方法
1)	方法的名字叫addGoods
2)	方法的形参是Goods类类型
3)	方法内调用集合的add方法，将传递过来的商品传递进去
③	定义showGoods方法
1)	方法没有形参
2)	方法的返回值类型是void
3)	遍历集合(这个集合在成员属性的位置定义的)
4)	获取集合中的每一个商品，调用商品的show方法
④	定义removeGoods方法
1)	方法的形参是Goods类型
2)	方法的返回值类型是void
⑤	定义total方法
1)	方法没有形参
2)	方法的返回值类型是void
3)	方法内遍历集合计算商品的总和并打印
 */
public class GouWuChe {
    ArrayList<Goods> list = new ArrayList<>();

    public GouWuChe() {
    }

    public GouWuChe(ArrayList<Goods> list) {
        this.list = list;
    }
    public  void addGoods(Goods goods){
        list.add(goods);

    }
    public void showGoods(){
        System.out.println("你购买的商品是:");
        for (int i = 0; i < list.size(); i++) {
            Goods goods = list.get(i);
            goods.show();
        }

    }
    public void removeGoods(Goods goods){
        list.remove(goods);
    }
    public void total(){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Goods goods = list.get(i);
            sum += goods.getPrice();
        }
        System.out.println("商品总价格是:"+sum+"元");
    }


}
