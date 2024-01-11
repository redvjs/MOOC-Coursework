
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int userInput = Integer.valueOf(scanner.nextLine());
        
        int squared = userInput * userInput;
        
        System.out.println(squared);
    }
}
