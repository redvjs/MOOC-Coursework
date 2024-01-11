
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        
        int sum = 0;
        int counter = 0;
        int average = 0;
        int even = 0;
        int odd = 0;
        
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + counter);
                System.out.println("Average: " + (sum/(double)counter));
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            }else if (number != -1) {
                sum = sum + number;
                counter += 1;
                if(number % 2 == 0) {
                    even += 1;
                } else {
                    odd += 1;
                        
                }
                continue;
            }
            
            
        }
        
        
        

    }
}
