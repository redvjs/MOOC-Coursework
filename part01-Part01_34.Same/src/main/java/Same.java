
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first string:");
        String first = scan.nextLine();
        System.out.println("Enter second string:");
        String second = scan.nextLine();
        // compare strings to see if they are the same
        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
