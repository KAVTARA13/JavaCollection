import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueClass {
    ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<Integer>();
    public void addInt(int number) {
        queue.add(number);
    }

    public void deleteLastInt(int number) {
        queue.remove(number);
        queue.forEach(System.out::println);
    }
}
