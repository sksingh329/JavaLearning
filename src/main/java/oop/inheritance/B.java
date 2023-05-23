package oop.inheritance;

public class B extends A{
    int b;

    B(int a, int b) {
        super(a);
        System.out.println("Inside class B constructor");
        this.b = b;
    }

    B(){}

    void displayB(){
        System.out.println("Value of b is: " + b);
    }

    void show(){
        System.out.println("Inside class B");
    }
}
