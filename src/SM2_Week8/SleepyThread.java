package SM2_Week8;

import java.util.Random;

public class SleepyThread implements Runnable {

    @Override
    public void run(){
        try{
            int sleepTime = new Random().nextInt(5000);
            System.out.println("Sleepy Thread about to sleep for " + sleepTime + " milliseconds");
            Thread.sleep(sleepTime);
            System.out.println("Sleepy Thread - awake again!");
        } catch (InterruptedException e){
            System.out.println("SleepyThread Interrupted");
            System.out.flush();
        }

    }
}
