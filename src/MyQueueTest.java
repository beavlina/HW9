import java.util.Queue;

public class MyQueueTest
{
    public static void main(String[] args)
    {
        MyQueue queue = new MyQueue();
        System.out.println("queue.size() = " + queue.size());
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Lemon");
        queue.add("Peach");
        queue.add("Orange");
        System.out.println("queue = " + queue);
        System.out.println("queue.size() = " + queue.size());
//        queue.clear();
//        System.out.println("queue.size() = " + queue.size());
//        System.out.println("queue = " + queue);
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue = " + queue);
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.size() = " + queue.size());
        System.out.println("queue = " + queue);
    }
}
