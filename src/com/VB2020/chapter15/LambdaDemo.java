package com.VB2020.chapter15;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNumber;

        myNumber = () -> 123.45;
        System.out.println(myNumber.getValue());

        myNumber = () -> Math.random() * 100;
        System.out.println(myNumber.getValue());
        System.out.println(myNumber.getValue());
    }
}
