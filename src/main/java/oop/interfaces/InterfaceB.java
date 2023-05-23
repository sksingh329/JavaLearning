package oop.interfaces;

public interface InterfaceB {
    default String reset(){
        return "Reset method from interface B";
    }
}
