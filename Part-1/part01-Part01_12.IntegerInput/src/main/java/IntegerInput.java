
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // print instructions
        System.out.println("Give a number: ");
        // accepts user input and converts the String into type Integer and assigns it to value
        int value = Integer.valueOf(scanner.nextLine());
        // prints text + the int
        System.out.println("You gave the number "+ value);

    }
}
