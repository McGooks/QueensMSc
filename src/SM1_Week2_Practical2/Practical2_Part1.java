package SM1_Week2_Practical2;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

/**
 * @file            Practical_Part1.java
 * @version         1.0
 * @author          Glenn McGookin
 * Created on:      02/10/2018
 * Description:     A program designed to print out a number detials about a string based on the user input
 */

public class Practical2_Part1 {
    public static void main(String[] args) {

        String now = new SimpleDateFormat("HH:mm").format(new Date());
        Scanner input = new Scanner(System.in); //Declaring a new scanner
        System.out.print("Enter your Name: ");
        String yourName = input.nextLine(); //User inserts their name when prompted
        input.close(); //Close Scanner

        System.out.println("\nThe time is: " + now);
        System.out.println("\nYour name is: " + yourName);
        System.out.println("The number of characters in the string: " + yourName.length());
        System.out.println("The first character in the string is " + yourName.charAt(0) + " \nThe second character is: " + yourName.charAt(0+1));
        System.out.println("The string in uppercase: " + yourName.toUpperCase());
        System.out.println("All instances of the letter 'n' replaced with '%': " + yourName.replace('n','%'));
        System.out.println("The position of the first 'n' is: " + yourName.indexOf('n') + "\nThe last 'n' is located at: " + yourName.lastIndexOf('n'));
    }
}
