package com.core.learning;

public class Fibonacci {
    public void fib(int number){
        int num1 = 0;
        int num2 = 1;
        int sum=0;
        for (int i = 0; i < number; i++) {
            System.out.print (" "+num1);
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        obj.fib(10);
    }
}
