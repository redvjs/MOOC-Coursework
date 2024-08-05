
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you? ");
        // check if input greater than or equal to 18, if true print
        if (Integer.valueOf(scan.nextLine()) >= 18) {
            System.out.println("You are an adult");
        // if first if statement is false, print
        } else {
            System.out.println("You are not an adult");
        }
    }
}
