public class Experiments {
    public static void main(String[] args) {
        double check = 4.1 % 1;
        double check2 = 4 % 1;
        System.out.println(check);
        System.out.println(check2);
        int myNumber = 5;
        System.out.println(myNumber);
        myNumber += 1;
        System.out.println(myNumber);
        myNumber = 5;
        myNumber <<= 3;
        System.out.println(myNumber);
        String string1 = "hello";
        String string2 = "hello";
        if (string1 == string2) {
            System.out.println("Same content");
        } else
        {
            System.out.println("Different texts");
        }
    }
}
