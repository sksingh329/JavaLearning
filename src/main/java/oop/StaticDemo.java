package oop;

class StaticExample{
    static int a;
    final int b = 0;
    static{
        System.out.println("This will be called only once");
        a = 10;
    }
    static void display(){
        System.out.println("a="+a);
        a += 10;
        //System.out.println("b="+b);// compile time error that static method cannot access non-static member
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        StaticExample.display();
        StaticExample.display(); // when this method is called it display incremented value of a
    }
}
