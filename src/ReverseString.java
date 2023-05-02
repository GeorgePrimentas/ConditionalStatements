import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input a string: ");
        // Declares an array of characters called "letters"
        // and assigns it the input of the user (a string)
        // converted (via toCharArray() method) to a sequence
        // (an array) of characters
        char[] letters = reader.nextLine().toCharArray();
        // The following for loop moves backwards...
        // i starts with a value of the length of the array
        // (letters) and decreases by 1 (i--) at each
        // iteration
        for (int i = letters.length-1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
    }
}

/* Alternative solution (without the use of arrays)

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input a string: ");
        // Declares a string variable called "letters"
        // and assigns it the input of the user (a string)
        String letters = reader.nextLine();
        // The following for loop moves backwards...
        // i starts with a value of the length of the string
        // (letters) and decreases by 1 (i--) at each
        // iteration
        for (int i=letters.length()-1; i>=0; i--) {
            System.out.print(letters.charAt(i));
        }
    }
}

End of Alternative solution */
