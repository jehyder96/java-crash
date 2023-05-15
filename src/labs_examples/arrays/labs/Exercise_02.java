import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

 public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number from 1 - 10");
      
        int userInput = myObj.nextInt();  // Read user input
        for(int i=0; i<array.length; i++) {
        if(userInput == array[i])
        {System.out.println(i);}
        }
        }
    }