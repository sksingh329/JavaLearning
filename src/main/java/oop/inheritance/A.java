package oop.inheritance;

public class A {
    int a;

    A(int a){
        System.out.println("Inside class A constructor");
        this.a =a;
    }
    A(){}

    void displayA(){
        System.out.println("Value of a is: "+a);
    }

    void show(){
        System.out.println("Inside class A");
    }
}
