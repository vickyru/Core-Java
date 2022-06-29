package com.core.learning.constructors;

public class ThisKeyWorld {

    public ThisKeyWorld() {
        System.out.println("Default Constructor");
    }
    public ThisKeyWorld(String str) {
        this();
        System.out.println(str + " constructor");
    }

    public static void main(String[] args) {
        ThisKeyWorld thisKeyWorld = new ThisKeyWorld("Parametrize");
    }
}
