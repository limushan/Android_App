package com.mushan.javatest;

public class LambdaTest {

    Calculation calculation = (int x, int y) -> {
        System.out.println(x + y);
    };


    //无需声明类型
    Calculation calculation2 = (x, y) -> {
        System.out.println(x + y);
        System.out.println(x - y);
    };

    //只有一个语句，可选大括号
    Calculation calculation3 = (x, y) -> System.out.println(x + y);


    //参数只有一个，可选括号，只有一个表达式，可选return关键字
    Calculation2 calculation4 = x -> x--;

    //有大括号必须显式的声明return关键字
    Calculation2 calculation5 = x -> {
        x *= x;
        return x;
    };

    public void test(){
        //lamdba表达式作为参数传递
        int x = calcaulate(10, x1 -> x1++);
    }



    public interface Calculation {
        void calculate(int x, int y);
    }

    public interface Calculation2 {
        int calculate(int x);
    }


    private int calcaulate(int x, Calculation2 calculation) {
        return x - calculation.calculate(x);
    }

}





