package com.test.selenium;

public class ArthimeticOperations {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        System.out.println("The Sum of two numbers is: " + add(a, b));
        System.out.println("The Difference of two numbers is: " + min(a, b));
        System.out.println("The Multiplication of two numbers is: " + mul(a, b));
        System.out.println("The Division of two numbers is: " + div(a, b));
    }

    public static int add(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }

    public static int min(int a, int b) {
        int diff;
        diff = a - b;
        return diff;
    }

    public static int mul(int a, int b) {
        int str;
        str = a * b;
        return str;
    }

    public static int div(int a, int b) {
        int d;
        d = a / b;
        return d;
    }

}
