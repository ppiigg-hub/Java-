package com.Test04;
/*
1.	定义商品类，
(1)	属性:商品名称（字符串类型），id（int类型），价格（double类型）
(2)	方法：
①	属性对应的get/set方法
②	提供空参数构造方法和满参数构造方法
③	定义show方法，方法没有形参，方法的返回值类型是void,方法内打印商品的名称，id,价格
2.	定义购物车GouWuChe类，具有如下成员
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
3.	创建Test测试类，在测试类中创建main方法，在main方法中创建GouWuChe对象，然后创建三个商品对象，信息如下:
调用GouWuChe对象的addGoods方法，分别将三个商品对象添加到GouWuChe对象中，
然后分别调用GouWuChe对象的showGoods方法和	total方法，打印一句话”============移除鼠标=================”,
然后调用GouWuChe对象的removeGoods方法，
将第三个商品删除，再次调用GouWuChe对象的showGoods方法，最后再调用GouWuChe对象的total方法


 */
public class Test {
    public static void main(String[] args) {
        GouWuChe gouWuChe = new GouWuChe();
        Goods goods1 = new Goods("电脑",10000,6999);
        Goods goods2 = new Goods("键盘",10001,159);
        Goods goods3 = new Goods("鼠标",10002,99);
        System.out.println("----------添加商品------------");
        gouWuChe.addGoods(goods1);
        gouWuChe.addGoods(goods2);
        gouWuChe.addGoods(goods3);
        gouWuChe.showGoods();
        gouWuChe.total();
        System.out.println("-----------移除鼠标------------");
        gouWuChe.removeGoods(goods3);
        gouWuChe.showGoods();
        gouWuChe.total();

    }

}
