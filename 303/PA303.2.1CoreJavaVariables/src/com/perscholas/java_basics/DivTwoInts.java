package com.perscholas.java_basics;

public class DivTwoInts {
    public static void main(String[] args) {
        int firstNum;
        double secondNum;
        firstNum = 1;
        secondNum = 2.0;
        //int secondNum;
        //java: incompatible types: possible lossy conversion from double to int
        //correction: declare secondNum and result variables as double
        double result = firstNum/secondNum;
        System.out.println(result);
    }
}
