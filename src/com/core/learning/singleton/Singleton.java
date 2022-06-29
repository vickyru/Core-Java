package com.core.learning.singleton;

public class Singleton {
    private static Singleton SingletonObject;

    private Singleton() {
        System.out.println("Creating object");
    }

    private static Singleton getInstance() {
        if (SingletonObject == null) {
            synchronized (Singleton.class) {
                SingletonObject = new Singleton();
                System.out.println(SingletonObject.hashCode());
            }
        }
        return SingletonObject;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().hashCode());
    }
}
