// The next line defines a new class called "ForLoop"
public class ForLoop {
    // The next line defines a new method called "main"
    public static void main(String[] args) {
        // For loop: Declares an integer variable called "x"
        // and initiates it with the value of 10
        // This will be the 'counter' of the loop
        // After the semicolon (;) there is
        // the condition that is needed to be met
        // in order for the loop to continue; x has to be
        // less than 20
        // After the semicolon (;) how much x is increased
        // after each iteration is defined (+1)
        for (int x=10; x < 20; x++) {
            // Displays on the console the value of the
            // variable x
            System.out.print("value of x: " + x);
            // The next line moves the printing/displaying point
            // on a different (the next) line so the next time the
            // loop iterates it will display x on the next line
            // The backslash character is the 'escape' character
            // and the 'n' stands for "new line"
            System.out.print("\n");
        }
    }
}
