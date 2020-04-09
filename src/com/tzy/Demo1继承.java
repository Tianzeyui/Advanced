package com.tzy;

public class Demo1继承 {
    public static void main(String[] args) {
        Child child = new Child("11", "11", "11");
        System.out.println(1);
    }
}


class Parent{
    private String name;
    private String age;

    public Parent() {
    }

    public Parent(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

class Child extends Parent{

    private String school;

    public Child() {
    }

    public Child(String school) {
        this.school = school;
    }

    public Child(String name, String age, String school) {
        super(name, age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}