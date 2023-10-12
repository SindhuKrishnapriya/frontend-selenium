package com.test.selenium;


public class FindEven {
    public static void main(String[] args) {
        int num = 4;
        int a = 3;
        int b = 2;
        func(num);
        System.out.println("The Sum of two numbers is: " + ArthimeticOperations.add(a, b));
        System.out.println("The Difference of two numbers is: " + ArthimeticOperations.min(a, b));
        System.out.println("The Multiplication of two numbers is: " + ArthimeticOperations.mul(a, b));
        System.out.println("The Division of two numbers is: " + ArthimeticOperations.div(a, b));

    }

    private static void func(int num) {
        if (num % 2 == 0) {
            System.out.println("The given number is Even");
        } else {
            System.out.println("The given number is Odd");
        }
    }

    public int boy(int c) {
        c++;
        return c;
    }
}
