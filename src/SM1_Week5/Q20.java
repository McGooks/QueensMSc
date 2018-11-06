package SM1_Week5;

public class Q20 {
    public static void main(String[] args) {
        int n = 4;

        System.out.println(n++);
        n += n;
        System.out.println(++n);
        n *= 2;
        System.out.println(n++);
        n /= n;
        System.out.println(--n);
    }
}
