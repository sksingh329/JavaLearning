package oop.methods;

class Overload {
    void test(){
        System.out.println("Called test() method without argument.");
    }
    void test(int a){
        System.out.println("Called test() method with argument: "+ a);
    }
}
public class OverloadDemo {
    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.test();
        overload.test(10);
    }
}
