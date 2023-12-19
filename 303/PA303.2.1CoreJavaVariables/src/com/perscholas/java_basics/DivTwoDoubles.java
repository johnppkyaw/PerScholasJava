package com.perscholas.java_basics;

public class DivTwoDoubles {
    public static void main(String[] args) {
        double smallNum, largeNum;
        smallNum = 5.5;
        largeNum = 11.0;
        double result = smallNum / largeNum;
        System.out.println(result);
        result = (int)result;
        System.out.println(result);
    }
}
