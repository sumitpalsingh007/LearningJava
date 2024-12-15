package helloworldconsulting.collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        //Queue<Integer> queue = new PriorityQueue<>();
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();

        queue.add(30);
        queue.add(10);
        queue.add(20);

        // Elements are processed in natural order (ascending)
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}