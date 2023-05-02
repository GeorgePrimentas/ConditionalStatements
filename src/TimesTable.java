// Imports Scanner class (from java.util package)
import java.util.Scanner;

// Defines a new class called "TimesTable"
public class TimesTable {
    // The next line defines a new method called "main"
    public static void main(String[] args) {
        // Creates a new Scanner object
        Scanner reader = new Scanner(System.in);
        // Prints message on the console to instruct the user what to input;
        System.out.println("What times table would you like? : ");
        // Expects user's input (blinking I-beam cursor) with reader.nextInt()
        // Declares an integer variable (called "timesTable") and initiates it
        // with the value after the assignment operator (=);
        // which is an integer (because of nextInt())
        int timesTable = reader.nextInt();
        // For loop: Declares an integer variable called "i"
        // and initiates it with the value of 1
        // This will be the 'counter' of the loop
        // After the semicolon (;) there is
        // the condition that is needed to be met
        // in order for the loop to continue; i has to be
        // less than 13 (so that only the first 12 times are displayed
        // After the semicolon (;) how much i is increased
        // after each iteration is defined (+1)
        for (int i=1; i < 13; i++) {
            // Displays the product of i multiplied by the integer the user
            // has input and moves to the next line (println)
            System.out.println(i + " x " + timesTable + " = " + i * timesTable);
        }
    }
}
