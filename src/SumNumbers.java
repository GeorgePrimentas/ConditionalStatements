// Imports Scanner class (from java.util package)
import java.util.Scanner;

// Defines a new class called "SumNumbers"
public class SumNumbers {
    // The next line defines a new method called "main"
    public static void main(String[] args) {
        // Declares an integer variable called "sumTotal" and
        // initiates it with the value of 0; this will be the
        // temporary and in the end the final result of the program
        int sumTotal = 0;
        // Creates a new Scanner object
        Scanner reader = new Scanner(System.in);
        // Prints message on the console to instruct the user what to input;
        System.out.println("Input a number to sum to: ");
        // Expects user's input (blinking I-beam cursor) with reader.nextInt()
        // Declares an integer variable (called "sumTo") and initiates it
        // with the value after the assignment operator (=);
        // which is an integer (because of nextInt())
        int sumTo = reader.nextInt();
        // Declares an integer variable called "ix" and
        // initiates it with the value of 1
        // This will be the 'counter' of the loop
        int i = 1;
        // The condition that is needed to be met
        // in order for the loop to continue: i has to be
        // less than sumTo (the number the user has input)
        while (i <= sumTo) {
            // Adds to the sumTotal (the result in question)
            // the current i number
            sumTotal += i;
            // Increases i by 1
            i++;
        }
        //Displays on the console the result/sum (sumTotal)
        System.out.println(sumTotal);
    }
}


