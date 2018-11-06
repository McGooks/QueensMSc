package SM1_Week5;

public class Q21 {
    public static void main(String[] args) {
        int answer = 0;
        for(int outer = 0; outer < 10; outer ++){
            for(int middle = 0; middle <5; middle++) {
                for (int inner = 0; inner < 10; inner++) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
