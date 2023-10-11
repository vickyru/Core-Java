package com.core.learning.swap;

public class SwapOfTwoNumber {
    public static void main(String[] args) {
        int x=10;
        int y=15;
        x = x + y;;
        y= x - y;
        x= x- y;
        System.out.println("X=" + x);
        System.out.println(("Y=") + y);
    }
}
