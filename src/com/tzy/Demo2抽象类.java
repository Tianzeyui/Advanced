package com.tzy;

public class Demo2抽象类 {
    public static void main(String[] args) {
        AbstractExtender abstractExtender = new AbstractExtender();
        System.out.println(abstractExtender.getItem());
    }
}

//继承抽象类
class AbstractExtender extends AbstractDemo{

    public AbstractExtender() {
    }

    public AbstractExtender(String item) {
        super.setItem(item);
    }

    @Override
    public String abstractMethod() {
        System.out.println(super.getItem());
        return "1";
    }
}

//抽象类
abstract class AbstractDemo {
    private String item;

    //静态块
    {
        this.item = "初始值";
    }

    //抽象方法
    public abstract String abstractMethod();

    public AbstractDemo() {
    }

    public AbstractDemo(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}