package advanced.collection_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void hashMapDemo(){
        HashMap<String,Integer> marks = new HashMap<>();

        marks.put("Subodh",10);
        marks.put("Sarita",20);
        marks.put("Suramya",30);

        System.out.println(marks.get("Suramya"));
        System.out.println(marks.containsKey("Subodh"));
        System.out.println(marks.containsKey("Ravi"));

        //Iterate over mao
        Set<Map.Entry<String,Integer>> entry = marks.entrySet();
        for(Map.Entry<String,Integer> mark: entry){
            System.out.println(mark.getKey() + " = " +mark.getValue());
        }
    }
    public static void main(String[] args) {
        hashMapDemo();
    }
}
