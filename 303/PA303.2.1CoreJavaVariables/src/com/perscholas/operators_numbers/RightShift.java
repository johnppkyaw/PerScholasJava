package com.perscholas.operators_numbers;

public class RightShift {
    public static void main(String[] args) {
        int x = 150, a = 225, b = 1555, c = 32456;
        System.out.println(Integer.toBinaryString(x)); //10010110
        System.out.println(Integer.toBinaryString(a)); //11100001
        System.out.println(Integer.toBinaryString(b)); //11000010011
        System.out.println(Integer.toBinaryString(c)); //111111011001000
        x = x >> 2; //100101 (32 + 4 + 1) 37
        System.out.println("Binary: " + Integer.toBinaryString(x) + " Dec: " + x);
        a = a >> 2; //111000 (8 + 16 + 32) 56
        System.out.println("Binary: " + Integer.toBinaryString(a) + " Dec: " + a);
        b = b >> 2; // 110000100 (4 + 128 + 256) 388
        System.out.println("Binary: " + Integer.toBinaryString(b) + " Dec: " + b);
        c = c >> 2; //1111110110010  (2 + 16 + 32 + 128 + 256 + 512 + 1024 + 2048
        // + 4096) = 8114
        System.out.println("Binary: " + Integer.toBinaryString(c) + " Dec: " + c);
    }
}
