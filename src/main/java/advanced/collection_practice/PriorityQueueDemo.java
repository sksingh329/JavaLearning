package advanced.collection_practice;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void priorityQueueDemo(){
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        queue.add(4);
        queue.add(3);
        queue.add(1);
        queue.add(5);
        queue.add(2);

        System.out.println(queue);
    }
    public static void main(String[] args) {
        priorityQueueDemo();
    }
}
