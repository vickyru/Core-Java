package com.core.learning;

public class UnderStandingVariables {
    int x = 5;
    static int y = 10;
    public static void main(String[] args) {
        int z = 20;
        System.out.println("Z=> " + z);
        System.out.println("X=> " + new UnderStandingVariables().printNumber());
    }

    private int printNumber(){
        return x;
    }

}
