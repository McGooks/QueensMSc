package SM1_Week3;

public class Q5 {
    public static void main(String[] args) {
        int x = 23;
        int y = 40;
        double z = 10.0;

        if ((z==y) || (y<x)) {
            System.out.println("A");
        } else if ((y > x) && (z > 10)) {
            System.out.println("B");
        } else if (x == y) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
