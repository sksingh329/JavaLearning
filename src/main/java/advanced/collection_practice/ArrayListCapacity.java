package advanced.collection_practice;

import java.util.ArrayList;

public class ArrayListCapacity {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.ensureCapacity(1);
        arrayList.add("A");
        arrayList.add("A");
        arrayList.trimToSize();
        System.out.println(arrayList.size());
    }
}
