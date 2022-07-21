import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(5);
        queue.add(3);
        queue.add(2);
        queue.add(4);
        //queue.offer(4);

        for(Integer s:queue){
            System.out.println(s);
        }
        System.out.println("------------------");

        System.out.println(queue.peek());
        System.out.println("------------------");

        queue.forEach(s-> System.out.println(s));
        System.out.println("------------------");
    }
}
