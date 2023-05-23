package oop.inheritance;

public class FindAreas {
    public static void main(String[] args) {
        // Figure f = new Figure(10,10); //this will give compile error as object of abstract class cannot be created
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);

        Figure figure;

        figure = r;
        System.out.println("Area is " + figure.area());

        figure = t;
        System.out.println("Area is " + figure.area());
    }
}
