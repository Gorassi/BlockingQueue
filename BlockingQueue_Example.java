package BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class BlockingQueue_Example {
    public static void main(String[] args) throws Exception {

        BlockingQueue queue = new ArrayBlockingQueue(3);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(producer);
        executorService.submit(consumer);

        Thread.sleep(3000);

        executorService.shutdownNow();

    }
}
