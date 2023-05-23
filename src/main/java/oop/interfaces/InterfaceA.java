package oop.interfaces;

public interface InterfaceA {
    default String reset(){
        return "Reset method from interface A";
    }
}
