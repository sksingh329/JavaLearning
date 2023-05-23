package oop.interfaces;

public class StackDemo {
    public static void main(String[] args) {
        IntStack intStack;
        FixedStack fs = new FixedStack(10);
        DynamicStack ds = new DynamicStack(10);

        intStack = fs;
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.push(40);
        intStack.push(50);

        intStack = ds;
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);

        intStack = fs;
        System.out.println("Fixed Stack items");
        for(int i =0; i < 5; i++)
            System.out.println(intStack.pop());

        intStack = ds;
        System.out.println("Dynamic Stack items");
        for(int i =0; i < 5; i++)
            System.out.println(intStack.pop());
    }
}
