package com.tzy;

public class Demo3设计模式模板模式 {
    public static void main(String[] args) {
        System.out.println("---------------");
        Paper studentAPaper = new StudentA();
        studentAPaper.answerQuestions();
        System.out.println("---------------");
        StudentB studentBPaper = new StudentB();
        studentBPaper.answerQuestions();
    }
}


abstract class Paper {
    public void answerQuestion1() {
        System.out.println("answer1 is "+answer1());
    }

    public void answerQuestion2() {
        System.out.println("answer2 is "+answer2());
    }

    public void answerQuestion3() {
        System.out.println("answer3 is "+answer3());
    }

    public void answerQuestions(){
        answerQuestion1();
        answerQuestion2();
        answerQuestion3();
    }

    abstract String answer1();
    abstract String answer2();
    abstract String answer3();
}

class StudentA extends Paper{

    @Override
    String answer1() {
        return "A";
    }

    @Override
    String answer2() {
        return "B";
    }

    @Override
    String answer3() {
        return "C";
    }
}

class StudentB extends Paper{

    @Override
    String answer1() {
        return "C";
    }

    @Override
    String answer2() {
        return "B";
    }

    @Override
    String answer3() {
        return "C";
    }
}