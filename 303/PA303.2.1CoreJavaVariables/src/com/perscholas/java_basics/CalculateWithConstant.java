package com.perscholas.java_basics;

public class CalculateWithConstant {
    public static void main(String[] args) {
        final double PAYRATE = 28.75;
        double workerAHours, workerBHours, grossPayA, grossPayB;
        workerAHours = 25;
        workerBHours = 30;
        //PAYRATE = 30;
        //java: cannot assign a value to final variable PAYRATE
        grossPayA = PAYRATE * workerAHours;
        grossPayB = PAYRATE * workerBHours;
        System.out.println("Worker A earns: " + grossPayA);
        System.out.println("Worker B earns: " + grossPayB);
    }
}