package com.core.learning;
/*
Returning class type as return type in overriding
 */
class A {
    A show(){
        System.out.println("Super show()");
        return this;
    }

}

class B extends A {
    B show(){
        System.out.println("Subclass show()");
        return this;
    }

    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();
        B obj2 = new B();
        obj2.show();

    }
}
