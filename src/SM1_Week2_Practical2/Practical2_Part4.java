package SM1_Week2_Practical2;

import java.util.Scanner;

public class Practical2_Part4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a decimal point number in the format xx.xxxx eg 12.3456: ");
        double number = input.nextDouble();
        input.close();
        int squared = 2;
        int cubed = 3;

        System.out.printf("\nNumber rounded (two decimal places):\t %.2f", Math.round(number*100)/100d);
        System.out.printf("\nNumber squared (three decimal places):\t %.3f", Math.pow(squared,number));
        System.out.printf("\nNumber cubed to (three decimal places):\t %.3f", Math.pow(cubed,number));
        System.out.printf("\nSquare Root (four decimal places):\t\t %.4f", number);

    }
}
