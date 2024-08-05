
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Give a number: ");
        // reads user input on nextline, converts from string to double, and assigns to value
        double value = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + value);

    }
}
