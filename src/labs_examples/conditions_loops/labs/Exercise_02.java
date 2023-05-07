import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
    
        // write completed here
        Scanner dayNumber = new Scanner(System.in); // Creating a Scanner object
        System.out.println("Enter a number between 1 and 7: ");
        
        int dayWeek = dayNumber.nextInt(); // reading user input
        if (dayWeek == 1) {
            System.out.println("That number is Monday");
        } else if (dayWeek == 2) {
            System.out.println("That number is Tuesday");
        } else if (dayWeek == 3) {
            System.out.println("That number is Wednesday");
        } else if (dayWeek == 4) {
            System.out.println("That number is Thursday");
        } else if (dayWeek == 5) {
            System.out.println("That number is Friday");
        } else if (dayWeek == 6) {
            System.out.println("That number is Saturday");
        } else if (dayWeek == 7) {
            System.out.println("That number is Sunday");
        } else {
            System.out.println("That number isn't between 1 and 7.");
        }
    }
}