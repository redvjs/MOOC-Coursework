
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        // initialize scanner
        Scanner scanner = new Scanner(System.in);
        // print instructions
        System.out.println("What's your name? ");
        // assign variable to user input
        String message = scanner.nextLine();
        // print "Hi" and the input message
        System.out.println("Hi " + message);
        

    }
}
