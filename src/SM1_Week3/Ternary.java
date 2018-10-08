package SM1_Week3;

import java.util.Scanner;

/**
 * @file            Tenary.java
 * @version         1.0
 * @author          Glenn McGookin
 * Created on:      08/10/2018
 * Description:     A program designed to ask the user to insert their age, and the program will use a Ternary
 *                  statement to print an output to the console based on the integer value inserted
 */

public class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input your age: ");
        int age = input.nextInt();

        System.out.println(age >=18 ? "You can vote" : "You cannot vote");

    }
}
