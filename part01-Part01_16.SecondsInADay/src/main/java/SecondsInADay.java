
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds? ");
        // converts user input to type int, and assigns to variable days
        int days = Integer.valueOf(scanner.nextLine());\
        // assigns value to secondsInDay
        int secondsInDay = 86400;
        // print the multiplication of int days times int secondsInDay
        System.out.println(days * secondsInDay);
    }
}
