import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main{

    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(
                new Error());
        // 1
        final VectorClass vectorClass = new VectorClass();
        final ConcurrentLinkedQueueClass concurrentLinkedQueueClass
                = new ConcurrentLinkedQueueClass();
        Thread t1 = new Thread() {
            public void run() {
                vectorClass.addString("text from T1");
                vectorClass.deleteLastString();
                concurrentLinkedQueueClass.addInt(4353);
                concurrentLinkedQueueClass.addInt(7824);
                concurrentLinkedQueueClass.deleteLastInt(4353);
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                vectorClass.addString("text from T2");
                vectorClass.deleteLastString();
                concurrentLinkedQueueClass.addInt(78249);
                concurrentLinkedQueueClass.addInt(8724);
                concurrentLinkedQueueClass.deleteLastInt(8724);
            }
        };

        t1.start();
        t2.start();

        // 2

        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(5);
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        queue.offer("f");
        queue.forEach(System.out::println);
    }
}
