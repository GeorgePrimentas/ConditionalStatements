// The next line defines a new class called "WhileLoop"
public class WhileLoop {
    // The next line defines a new method called "main"
    public static void main(String[] args) {
        // Declares an integer variable called "x" and
        // initiates it with the value of 0
        // This will be the 'counter' of the loop
        int x=0;
        // This is the condition that is needed to be met
        // in order for the loop to continue; x has to be
        // less than 20
        while (x < 20) {
            // Displays on the console the value of the
            // variable x
            System.out.print("value of x: " + x);
            // Increases x by 1
            x++;
            // The next line moves the printing/displaying point
            // on a different (the next) line so the next time the
            // loop iterates it will display x on the next line
            // The backslash character is the 'escape' character
            // and the 'n' stands for "new line"
            System.out.print("\n");
        }
    }
}
