
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number: ");
        // check if user inputs value 1984, if true, print Orwell
        if (Integer.valueOf(scan.nextLine()) == 1984) {
            System.out.println("Orwell");
        }
    }
}
