package basics.datatypes;
import java.util.Arrays;

public class ArraysClassDemo {
    public static void main(String[] args) {
        int[] marks1 = {10,20,30};
        int[] marks2 = {10,20,30};
        int[] marks3 = {10,20,40};

        System.out.println(Arrays.equals(marks1,marks2)); // True
        System.out.println(Arrays.equals(marks1,marks3)); // False

        int[] input = {5,4,10,3,1,0,12,2};
        Arrays.sort(input);

        for(int val : input){
            System.out.print( val + " "); // 0 1 2 3 4 5 10 12
        }
    }
}
