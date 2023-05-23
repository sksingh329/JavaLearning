package oop.inheritance;

public class MethodOverridingDemo {
    public static void main(String[] args) {
        B b = new B(10,20);
        b.show(); // this will call show() method defined in class B
    }
}
