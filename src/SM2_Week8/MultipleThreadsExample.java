package SM2_Week8;

public class MultipleThreadsExample {

    public void MultipleThreadExmaple(){

    }

    public static void main(String[] args) {

        for(int i = 0; i < 1000; i++){
            ThreadOutputsNumber ton = new ThreadOutputsNumber();
            ton.number = i;
            Thread t = new Thread(ton);
            t.start();
        }
    }
}
