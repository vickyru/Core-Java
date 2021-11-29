package com.core.learning;

public class MethodOverLoading {
    private int add(int a, int b){
        return  a+b;
    }

    private int add(int a, int b, int c){
        return a+b+c;
    }
    private long add(long a, long b){
        return a+b;
    }
    private Object add(int a, long b){
        return  a+b;
    }

    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        System.out.println(obj.add(2,3));
        System.out.println(obj.add(1,2,3));
        System.out.println(obj.add(3l,3l));
        System.out.println(obj.add(5,5l));
    }
}
