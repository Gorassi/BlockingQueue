package BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue queue;

    Consumer(BlockingQueue queue){
        this.queue = queue;
    }

    public void run(){
        try{
            while(true) {
                System.out.println( queue.take());
            }
        }catch (InterruptedException e) {
            System.out.println( String.format("[%s] - Thread Consumer finished ! : ", Thread.currentThread().getName()) );
        }


    }
}
