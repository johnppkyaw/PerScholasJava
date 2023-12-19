package com.perscholas.operators_numbers;

public class IncrementAndSum {
    public static void main(String[] args) {
        int x, y, sum, c;
        x = 5;
        y = 8;
        sum = ++x + y; //14  x = 6
        System.out.println(sum);
        sum = x++ + y; //14  x = 7
        System.out.println(sum);
    }
}
