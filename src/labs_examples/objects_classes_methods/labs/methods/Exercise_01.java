/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    int multiply(int a, int b){
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    int divide(int a, int b){
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void printJoke() {
        System.out.println("What is funnier than twenty four?");
        System.out.println("Twenty five");
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static long yearSeconds(long years){
        long secondsInYear = 31536000;
        long numYears = years * secondsInYear;
        return numYears;
    } 


    // 5) Create a varargs method that will return the length of the varargs array passed in
    // public static int someFunction(int... age) {
    //     return age.length;
    //  }






}
