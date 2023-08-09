//package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 3: My First Program
 *
 *      Write the necessary code to display the follow message to the console
 *
 *      Hello World!
 *      Check out my first program!
 *
 */

public class Exercise_03 {

	public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        
        int strVal = 5;

        String str2 = "hello!";
        // please initialize a boolean variable and test whether str is equal to str2
        
        boolean strIsEqual = true;

        // please concatenate str & str2 and set the result to a new String variable below
        
        String str3 = str + str2;

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        
        System.out.println(str3);

    }

}
