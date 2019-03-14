package SM2_Week8;

public class ThreadInterruptableExampleTest {

    public static void main(String[] args) {
        ThreadInterruptableExample tie = new ThreadInterruptableExample();
        Thread tieThread = new Thread(tie,"Worker Thread");
        tieThread.start();

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        tieThread.interrupt();
    }


}
