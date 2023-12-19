package com.perscholas.operators_numbers;

public class BinaryOne {
    public static void main(String[] args) {
        int x = 2;
        System.out.println(Integer.toBinaryString(x)); //10
        x = x << 1;
        //binary 100
        //decimal 4
        System.out.println("Binary: " + Integer.toBinaryString(x) + "\n" +
                "Decimal: " + x);

        int a = 9, b = 17, c = 88;
        System.out.println(Integer.toBinaryString(a)); //1001
        System.out.println(Integer.toBinaryString(b)); //10001
        System.out.println(Integer.toBinaryString(c)); //1011000
        a = a << 1;
        //10010
        //16

        b = b << 1;
        //100010
        //34

        c = c << 1;
        //10110000
        //16+32+128 = 176

        System.out.println("Binary: " + Integer.toBinaryString(a) + "\n" +
                "Decimal: " + a);

        System.out.println("Binary: " + Integer.toBinaryString(b) + "\n" +
                "Decimal: " + b);

        System.out.println("Binary: " + Integer.toBinaryString(x) + "\n" +
                "Decimal: " + c);

    }
}
