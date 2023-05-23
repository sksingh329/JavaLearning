package oop;

class Box {
    double width;
    double height;
    double depth;

    Box(){
        width = height = depth = -1;
    }
    Box(double width,double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }
}
public class BoxDemo {
    public static void main(String[] args) {

        Box b1 = new Box();
        b1.height = 10;
        Box b2 = b1;
        System.out.println(b1); //both address are same
        System.out.println(b2);
        b2.height = 20;
        System.out.println(b1.height);
        b1 = null;
        System.out.println(b2.height);
        System.out.println(b1); // it is null
        System.out.println(b2); // still pointing to object
    }
}
