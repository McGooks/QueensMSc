package SM2_Week8;

public class ThreadOutputsNumber implements Runnable {

    int number = 0;

    @Override
    public void run() {
        System.out.println("Thread " + number + " started");
    }
}
