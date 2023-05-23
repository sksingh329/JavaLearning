package oop;

public class Stack {
    int stck[] = new int[10];
    int top;

    public Stack(){
        top = -1;
    }

    public void push(int item){
        if(top == 9){
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
