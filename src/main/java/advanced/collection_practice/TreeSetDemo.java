package advanced.collection_practice;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(5);
        ts.add(8);
        ts.add(0);
        ts.add(2);
        ts.add(10);

        System.out.println(ts);
    }
}
