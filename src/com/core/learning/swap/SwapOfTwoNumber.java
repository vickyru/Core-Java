package com.core.learning.swap;

public class SwapOfTwoNumber {
    public static void main(String[] args) {
        int x=10;
        int y=15;
        x=x-y;; //10-15 x=-5
        y=y+x; // 15+(-5) y=10
        x=y-x; //10-(-5) = =15
        System.out.println("X=" + x);
        System.out.println(("Y=") + y);
    }
}
