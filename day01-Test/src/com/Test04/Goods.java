package com.Test04;
/*
定义商品类，
(1)	属性:商品名称（字符串类型），id（int类型），价格（double类型）
(2)	方法：
①	属性对应的get/set方法
②	提供空参数构造方法和满参数构造方法
③	定义show方法，方法没有形参，方法的返回值类型是void,方法内打印商品的名称，id,价格
 */
public class Goods {
    private String name;
    private int id;
    private double price;

    public Goods() {
    }

    public Goods(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void show(){
        System.out.println("商品名称："+name+"id"+id+"价格："+price);
    }
}
