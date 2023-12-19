package com.perscholas.operators_numbers;

public class BitwiseAndOrOperator {
    public static void main(String[] args) {
        int x, y, z;
        x = 7;
        y = 17;
        System.out.println(Integer.toBinaryString(x)); //00111
        System.out.println(Integer.toBinaryString(y)); //10001
        z = x & y; //binary = 00001 decimal = 1
        System.out.println("Binary: " + Integer.toBinaryString(z) + " Dec: " + z);

        z = x | y; //binary 10111 decimal 16 + 4 + 2 + 1 = 23
        System.out.println("Binary: " + Integer.toBinaryString(z) + " Dec: " + z);

    }
}
