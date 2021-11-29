package com.core.learning;

class Super {
    void show(){
        System.out.println("Super class show method");
        }
}
class Subclass extends Super{
    void show(){
        System.out.println("Subclass class show method");
    }

    void print(){
        System.out.println("subclass print method");
    }

    public static void main(String[] args) {
        Super obj1 = new Super();
        obj1.show();
        Super obj2 = new Subclass(); //Overriding Example
        obj2.show();
        Subclass obj3 = new Subclass();
        obj3.show();
        obj3.print();
//        MethodOverriding obj4= new Super();

    }

}
