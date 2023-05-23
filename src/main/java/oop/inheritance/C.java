package oop.inheritance;

public class C extends B{
    int c;

    C(int a, int b,int c) {
        super(a,b);
        System.out.println("Inside class C constructor");
        this.c = c;
    }

    C() {}

    void displayC(){
        System.out.println("Value of c is: " + c);
    }

    void displayAll(){
        displayA();
        displayB();
        displayC();
    }
    void show(){
        System.out.println("Inside class C");
    }
}
