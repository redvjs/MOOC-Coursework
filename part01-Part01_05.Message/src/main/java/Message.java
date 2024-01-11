
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prints "Write a message:"
        System.out.println("Write a message:");
        
        // Takes User input and saves it in the variable *message*
        String message = scanner.nextLine();

        // Prints string variable *message* 
        System.out.println(message);

    }
}
