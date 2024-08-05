
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // print text
        System.out.println("Greetings! How are you doing?");
        // assign user input
        String one = scanner.nextLine();
        // print text 
        System.out.println("Oh, how interesting. Tell me more!");
        // assign user input
        String two = scanner.nextLine();
        // print text
        System.out.println("Thanks for sharing!");
    }
}
