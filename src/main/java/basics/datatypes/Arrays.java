package basics.datatypes;

public class Arrays {
    public static void main(String[] args) {

        //Array declaration and allocating memory using new, at this point values assigned to array component is 0
        int[] monthDays = new int[12];
        System.out.println(monthDays);

        // Print all element in array
        for (int i = 0; i < monthDays.length; i++){
            System.out.print(monthDays[i] + " ");
        }
        System.out.println();
        //Array class name - array of int -> [I
        System.out.println(monthDays.getClass().getName());

        //Assign 31 to 2nd index
        monthDays[2] = 31;

        // Print all element in array
        for (int i = 0; i < monthDays.length; i++){
            System.out.print(monthDays[i] + " ");
        }
    }
}
