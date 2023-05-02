public class ThreeDigitCodes {
    public static void main(String[] args) {
        // Declares and initiates (with a value of 0)
        // the variable which counts how many three-
        // digit numbers (combinations) are possible
        int counter = 0;
        for (int i = 1; i <=4; i++)
        {
            for (int j = 1; j <=4; j++)
            {
                for (int k = 1; j <=4; j++)
                {
                    // Condition: each (&&) digit has to be
                    // different (!=) than the other digits
                    if (i != j && i != k && j != k )
                    {
                        System.out.println(i + "" + j + "" + k);
                        counter ++;
                    }
                }
            }
        }
        System.out.println("The total number of unique combinations is: " + counter);
    }
}
