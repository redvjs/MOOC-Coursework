
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something: ");
        // accepts input, converts string to boolean, assigns to value
        boolean value = Boolean.valueOf(scanner.nextLine());
        System.out.println("True or false? " +value);

    }
}
