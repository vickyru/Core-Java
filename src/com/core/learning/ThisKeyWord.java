package com.core.learning;

public class ThisKeyWord {
    int x = 5;
    int z = 20;
    private void print(){
        int z = 10;
        System.out.println("X => " + this.x); //this.x
        System.out.println("Z => " + z); //z -> Memory allocate to local variable whenever method is loaded into JVM
        System.out.println("Z => " + this.z);   // instance variable is using his keyword
//        System.out.println("Y => " + y);  // Z is local variable to main method
    }

    public static void main(String[] args) {
        int y = 15;
        ThisKeyWord obj = new ThisKeyWord();
        obj.print();
        System.out.println("Y => " + y);
    }
}
