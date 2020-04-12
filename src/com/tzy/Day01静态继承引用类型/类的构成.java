package com.tzy.Day01静态继承引用类型;

/**
 *
 */
public class 类的构成 {
    public static void main(String[] args) {
        //创建对象
        User user = new User();
        //调用静态方法不需要创建对象
        User.getClassID();

    }

}

class User{
    /**
     * 类的组成部分：1.成员变量 2.成员方法 3.构造器 4.代码块 5.内部类
     * this关键字修饰表示当前类对象的变量/方法所以叫实例变量/实例方法
     * static关键字修饰的变量/方法表示当前类的变量/方法，类唯一，所以只有一份，线程非安全
     */


    //成员变量
    private String name;
    private Integer age;
    //静态成员变量
    private static String classID;

    //代码块
    {
        this.name = "默认名";
        this.age = 0;
    }

    //无参构造器/空构造器
    public User() {
    }

    //构造器
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    //get set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static String getClassID() {
        return classID;
    }

    public static void setClassID(String classID) {
        User.classID = classID;
    }

    //静态方法
    static void say(){
        System.out.println("say sth");
    }

    //内部类
    public class Eat{
        void eat(){
            System.out.println("eat sth");
        }
    }
}