package advanced.collection_practice;

import java.util.Set;

public class LinkedHashSet {
    public static void linkedHashSetDemo(){
        Set<Integer> set = new java.util.LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(25);
        set.add(20);

        System.out.println(set);
    }
    public static void main(String[] args) {
        linkedHashSetDemo();
    }
}
