package oop.inheritance;

public class DynamicMethodDispatchDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r;

        r = a;
        r.show();

        r = b;
        r.show();

        r = c;
        r.show();
    }
}
