package SM1_Week3;

import java.util.Scanner;

/**
 * @file            Switch.java
 * @version         1.0
 * @author          Glenn McGookin
 * Created on:      08/10/2018
 * Description:     A program designed to ask the user to insert two integers, and the program will use an if else
 *                  statement to do a comparison and print out a message advising if both integers are the same.
 */

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert a month number: ");
        int num1 = input.nextInt();
        String output;

        switch (num1) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                output = "Semester 2";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                output = "Summer";
                break;
            case 10:
            case 11:
            case 12:
                output = "Semester 1";
                break;
            default:
                output = "Error! Please insert a number between 1 & 12";
        }

        System.out.printf("Month %s falls during %s" , num1, output);
    }
}
