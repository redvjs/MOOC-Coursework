
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics totalSum = new Statistics();
        Statistics totalEvenSum = new Statistics();
        Statistics totalOddSum = new Statistics();
        
        System.out.println("Enter numbers: ");
        
        while(true){
            int numbers = Integer.valueOf(scanner.nextLine());
            if(numbers == -1){
                break;
                
            }
            totalSum.addNumber(numbers);
            if (numbers % 2 != 0) {
                totalOddSum.addNumber(numbers);
            } else if (numbers % 2 == 0) {
                totalEvenSum.addNumber(numbers);
            }
        }
        System.out.println("Sum: " + totalSum.sum());
        System.out.println("Sum of even numbers: " + totalEvenSum.sum());
        System.out.println("Sum of odd numbers: " + totalOddSum.sum());
        
    }
}
