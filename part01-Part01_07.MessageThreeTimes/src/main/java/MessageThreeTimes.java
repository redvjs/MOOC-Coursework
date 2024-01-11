
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        // initialize scanner
        Scanner scanner = new Scanner(System.in);
        // print instructions
        System.out.println("Write a message:");
        // assigns String variable message to input on the next line
        String message = scanner.nextLine();
        // prints the message three times
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }
}
