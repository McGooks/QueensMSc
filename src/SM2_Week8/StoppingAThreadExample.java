package SM2_Week8;

import java.util.Random;

public class StoppingAThreadExample {

    public static void main(String[] args) {
        SleepyThread sleepyThread = new SleepyThread();
        Thread newThread = new Thread(sleepyThread);
        newThread.start();

        try{
            int mainSleepTime = new Random().nextInt(5000);
            System.out.println("Main thread - going to sleep " + mainSleepTime + " milliseconds");
            Thread.sleep(mainSleepTime);
            System.out.println("Main thread - awake");
        } catch (InterruptedException e){

        }

        System.out.println("Main thread - checking if sleepythread is awake");
        if (newThread.isAlive()){
            System.out.println("Main thread - sleepyThread sleeping. Going to interrupt it!");
            newThread.interrupt();
            try{
                Thread.sleep(1);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Main finished");
        System.out.flush();
    }
}
