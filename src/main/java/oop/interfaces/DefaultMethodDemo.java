package oop.interfaces;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
        System.out.println(MyIF.getDefaultNumber());
    }
}
