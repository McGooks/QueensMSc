package SM2_Week8;

public class ThreadOutputName implements Runnable {

    @Override
    public void run () {
        String name = Thread.currentThread().getName();
        System.out.println("Thread " + name + "started");
    }

}
