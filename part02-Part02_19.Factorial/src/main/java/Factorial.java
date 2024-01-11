
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int result = 1;
        System.out.println("Last number? ");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= lastNumber; i++) {
            result *= i;
            
        }
        System.out.println("Factorial: " + result);
    }
}
