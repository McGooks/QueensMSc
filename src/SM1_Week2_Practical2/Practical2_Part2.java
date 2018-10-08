package SM1_Week2_Practical2;

import java.util.Scanner;

/**
 * @file            Practical_Part2.java
 * @version         1.0
 * @author          Glenn McGookin
 * Created on:      02/10/2018
 * Description:     A program designed to print out the area of a sqaure based on the user input
 */

public class Practical2_Part2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Declaring a new scanner
        System.out.print("Enter the length of the side: ");
        int sideLength = input.nextInt(); //User inserts the length of the side name when prompted
        input.close(); //Close Scanner

        System.out.println("The Area of the square is: " + sideLength * sideLength); //Area calculation

    }
}
