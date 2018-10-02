package Practical2;

import java.util.Scanner;

/**
 * @file            Practical_Part3.java
 * @version         1.0
 * @author          Glenn McGookin
 * Created on:      02/10/2018
 * Description:     A program designed to print out the area of a circle based on the user input
 */

public class Practical2_Part3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Declaring a new scanner
        System.out.print("Enter the diameter of the circle: ");
        double diameter = input.nextDouble(); //User inserts the length of the side name when prompted
        double radius = diameter * 0.5;
        input.close(); //Close Scanner

        System.out.printf("The area of the circle is: %.2f", Math.PI * radius * radius);
        System.out.println("\nThe radius is: " +radius);

    }
}
