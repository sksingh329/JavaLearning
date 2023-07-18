package advanced.exceptionalhandling;

public class DivideByZero {
    public static void main(String[] args) {
        int d = 0;
        try{
            int a = 42/d;
            System.out.println("a = "+a); // this will not be printed in case of exception
        }
        catch (ArithmeticException ex){
            System.out.println("Division by zero. Message "+ex);
        }
        System.out.println("After catch statement.");
    }
}
