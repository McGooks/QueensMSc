package SM1_Week3;

import java.util.Scanner;

/**
 * @file            If_Else_If.java
 * @version         1.0
 * @author          Glenn McGookin
 * Created on:      08/10/2018
 * Description:     A program designed to ask the user to insert two integers, and the program will use an if else
 *                  statement to do a comparison and print out a message advising if both integers are the same.
 */

public class If_Else_If {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please inset the first number: ");
        int num1 = input.nextInt();
        System.out.print("Please inset the second number: ");
        int num2 = input.nextInt();
        input.close(); //Close Scanner

        if(num1 == num2){
            System.out.println("Both numbers are the same");
        } else if (num1 < num2){
            System.out.println(num2 + " is the biggest number");
        } else {
            System.out.println(num1 + " is the biggest number");
        }

    }
}
