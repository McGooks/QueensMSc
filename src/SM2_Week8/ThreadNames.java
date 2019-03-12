package SM2_Week8;

public class ThreadNames {
    public static void main(String[] args) {
        ThreadOutputName nameThread = new ThreadOutputName();

        Thread thread = new Thread(nameThread, "My Wee Thread");
        thread.start();
    }
}
