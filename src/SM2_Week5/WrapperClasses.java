package SM2_Week5;

import java.util.Arrays;
import java.util.Collections;

public class WrapperClasses {


    public static void main(String[] args) {
        int i1 = 33;
        String i2 = "999";
        double i3 = 23.4;
        Integer i4 = 4;
        int i5 = 67;
        int i6 = 31;
        String i7 = "60";
        double i8 = 22.2;
        int i9 = -22;

        Double[] wpr = new Double[9];
        wpr[0] = Double.valueOf(i1);
        wpr[1] = Double.valueOf(i2);
        wpr[2] = Double.valueOf(i3);
        wpr[3] = i4.doubleValue();
        wpr[4] = Double.valueOf(i5);
        wpr[5] = Double.valueOf(i6);
        wpr[6] = Double.parseDouble(i7);
        wpr[7] = Double.valueOf(i8);
        wpr[8] = Double.valueOf(i9);

        System.out.println("Unsorted Array");
        for (int i = 0; i < wpr.length; i++) {
            System.out.println(wpr[i]);
        }

        Arrays.sort(wpr);

        System.out.println("Sorted Array");
        for (int i = 0; i < wpr.length; i++) {
            System.out.printf("%.1f%n", wpr[i]);
        }

    }

}
