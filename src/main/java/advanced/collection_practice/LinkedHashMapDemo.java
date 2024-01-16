package advanced.collection_practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void linkedHashMapDemo(){
        LinkedHashMap<String,Integer> marks = new LinkedHashMap<>();
        marks.put("Subodh",10);
        marks.put("Sarita",20);
        marks.put("Suramya",30);

        Set<Map.Entry<String,Integer>> entry = marks.entrySet();
        for(Map.Entry<String,Integer> mark: entry){
            System.out.println(mark.getKey() + " = " +mark.getValue());
        }
    }
    public static void main(String[] args) {
        linkedHashMapDemo();
    }
}
