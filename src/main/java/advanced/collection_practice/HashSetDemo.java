package advanced.collection_practice;

import java.util.HashSet;

public class HashSetDemo {

    public static void hashSetDemo(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("E");

        hashSet.add("C");

        System.out.println(hashSet);
    }
    public static Integer[] removeDuplicate(int[] inputArray){
        HashSet<Integer> set = new HashSet<>();
        for(int elem : inputArray){
            set.add(elem);
        }
        return set.toArray(new Integer[set.size()-1]);
    }

    public static void main(String[] args) {
        int[] input = {1,3,2,1,3,3};
        Integer[] output = removeDuplicate(input);
        for (Integer element:output) {
            System.out.println(element);
        }
    }
}
