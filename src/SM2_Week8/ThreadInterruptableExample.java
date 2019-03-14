package SM2_Week8;

public class ThreadInterruptableExample implements Runnable {

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+ ": started");
        for(int loop = 0; loop < 1000000; loop++){
            System.out.println(Thread.currentThread().getName()+ ": running " + loop);

            if(Thread.interrupted()){
                break;
            }
        }
        System.out.println(Thread.currentThread().getName()+": ended");
    }
}
