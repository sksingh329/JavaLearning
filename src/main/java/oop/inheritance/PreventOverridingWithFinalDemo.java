package oop.inheritance;

public class PreventOverridingWithFinalDemo {
}

class PreventOverridingWithFinalA{
    final void displayA(){

    }
}

class PreventOverridingWithFinalB extends PreventOverridingWithFinalA{
    //void displayA(){ // Compile-time error as  methods cannot be overridden because this method is declared as final in super class

    //}
}
