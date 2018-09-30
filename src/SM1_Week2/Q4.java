package SM1_Week2;

public class Q4 {
    public static void main(String[] args) {
        double bal = 5.33;
        double tax = 9.21;
        int limit = 2;
        System.out.println("Result : " + ((float)(limit*tax)/(int)(bal))*(int)(tax*bal));
    }
}
