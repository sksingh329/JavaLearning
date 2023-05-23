package basics.controlstatements;

public class IfElseDemo {
    public static void main(String[] args) {
        int number = 10;
        if(number % 2 == 0){
            System.out.println(number + " is even number.");
        }
        else{
            System.out.println(number + " is odd number.");
        }
    }
}
