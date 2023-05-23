package oop;

class AccessControl{
    int a;
    private int b;
    void print(){
        System.out.println("a= "+ a +", b = "+b);
    }
}

public class AccessControlDemo {
    public static void main(String[] args) {
        AccessControl accessControl = new AccessControl();
        accessControl.a = 10;
        //accessControl.b =20; // this will give compile time error as 'b' is declared as private in class and will not be accessible outside
        System.out.println(accessControl.a);
        accessControl.print(); // print() method is accessible as it default i.e. accessible inside package
    }
}
