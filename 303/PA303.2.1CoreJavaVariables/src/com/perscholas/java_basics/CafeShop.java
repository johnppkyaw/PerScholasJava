package com.perscholas.java_basics;

public class CafeShop {
    public static void main(String[] args) {
        double coffeePrice, espressoPrice, teaPrice;
        coffeePrice = 6;
        espressoPrice = 7;
        teaPrice = 7.5;
        double subtotal, totalSale;
        subtotal = (coffeePrice * 3) + (espressoPrice * 4) + (teaPrice * 2);
        final double SALES_TAX = 0.095;
        totalSale = (subtotal * SALES_TAX) + subtotal;
        System.out.printf("%.2f", totalSale);
    }
}
