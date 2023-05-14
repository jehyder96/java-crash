import java.util.Arrays;
import java.util.Scanner;  // Import the Scanner class


/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
      int[] arrayCalculator = new int[10]; // Creating the array to store the user input
      
      scanner myObj = new Scanner(System.in);  // Create a Scanner object
      System.out.println("Please type in ten numbers.");
      
      //String userInput = myObj.nextLine();  // Read user input
      int sum = 0; //declaring variable to add all user input together
      for (int i = 0; i < arrayCalculator.length; i++){ 
        arrayCalculator[i] = myObj.nextInt();
        sum = sum + arrayCalculator[i]; // adds all user input and stores it into sum
        System.out.println(arrayCalculator[i]);
      }
      System.out.println("Sum is " + sum + " Average is " + sum/arrayCalculator.length);
    }

}