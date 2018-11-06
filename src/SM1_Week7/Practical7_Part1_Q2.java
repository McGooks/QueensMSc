package SM1_Week7;

import java.util.Scanner;

public class Practical7_Part1_Q2 {
    // Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert an Uppercase Letter: ");
        char character = input.next().charAt(0);
        convertFromUpperToLower(character);
    }

    /**
     * A method to convert an uppercase input and return the lowercase equivalent
     * @param letter letter passed in from the main method
     */
    public static void convertFromUpperToLower(char letter) {

        if (Character.isUpperCase(letter)){
            System.out.println("The letter " + Character.toLowerCase(letter) + " is now displayed lowercase");
        } else {
            System.out.println("The letter " + letter + " is already in lowercase");
        }

    }

}
