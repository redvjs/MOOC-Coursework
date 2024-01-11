
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number: ");
        // check if input value is greater than 0, if true print
        if (Integer.valueOf(scan.nextLine()) > 0) {
            System.out.println("The number is positive.");
        // if first check false, print
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
