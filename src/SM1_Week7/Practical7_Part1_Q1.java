package SM1_Week7;

import java.util.Scanner;

public class Practical7_Part1_Q1 {
    // Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert a number: ");
        int value = input.nextInt();
        oddOrEven(value);
    }


    /** Method to check if the int value is dividable by 2 and has no remainder
     *  then outputs the corresponding result to the console.
     * @param num value passed in from the main method
     */
    public static void oddOrEven(int num) {
        if(num%2 == 0){
            System.out.println("The number you entered is Even");
        } else{
            System.out.println("The number you entered is Odd");
        }
    }

}
