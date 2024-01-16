package advanced.collection_practice;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        System.out.println(ll);

        ll.remove();
        System.out.println(ll);

        ll.add(1,"A2");
        System.out.println(ll);

        ll.remove(5);
        System.out.println(ll);

        System.out.println("2nd element is: "+ll.get(1));

        String val = ll.get(2);
        ll.set(2,val + " Changed");

        System.out.println(ll);
    }
}
