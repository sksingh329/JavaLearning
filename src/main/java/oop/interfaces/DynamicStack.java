package oop.interfaces;

public class DynamicStack implements IntStack{
    int[] stck;
    int top;

    public DynamicStack(int size){
        stck = new int[size];
        top = -1;
    }

    public void push(int item){
        if(top == stck.length-1){
            int[] temp = new int[stck.length*2];
            for(int i =0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++top] = item;
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
