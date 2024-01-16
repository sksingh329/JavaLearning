package advanced.collection_practice;

import java.util.ArrayList;

public class AbstractListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("Array List size before adding elements " + arrayList.size());
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add(1,"A2");
        System.out.println("Array List size after adding elements " + arrayList.size());
        System.out.println("Content of arrayList "+arrayList);

        arrayList.remove("F");
        arrayList.remove(2);
        System.out.println("Array List size after removing elements " + arrayList.size());
        System.out.println("Content of arrayList "+arrayList);
    }
}
