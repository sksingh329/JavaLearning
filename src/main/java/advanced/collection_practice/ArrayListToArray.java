package advanced.collection_practice;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);

        Integer[] iArray = new Integer[integerArrayList.size()];
        iArray = integerArrayList.toArray(iArray);

        int sum = 0;
        for(int i : iArray) sum += i;

        System.out.println("Sum is: "+sum);
    }
}
