package oop.interfaces;

public class FixedStack implements IntStack{
    int[] stck;
    int top;

    public FixedStack(int size){
        stck = new int[size];
        top = -1;
    }

    public void push(int item){
        if(top == stck.length-1){
            System.out.println("Stack is full.");
        }
        else{
            stck[++top] = item;
        }
    }

    public int pop(){
        if(top < 0){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            return stck[top--];
        }
    }
}
