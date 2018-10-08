package SM1_Week3;

/**
 * @file            Selection.java
 * @version         1.0
 * @author          Glenn McGookin
 * Created on:      08/10/2018
 * Description:     A program designed to ask the user to insert their age, and the program will use an if else
 *                  statement to print an output to the console based on the integer value inserted
 */

import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input your age: ");
        int age = input.nextInt();
        input.close(); //Close Scanner

        if(age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }
    }
}
