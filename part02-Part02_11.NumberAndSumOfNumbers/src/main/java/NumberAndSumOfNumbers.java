
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOfNumbers = 0;
        int sumOfNumbers = 0;
        
        while(true){
            System.out.println("Give a number: ");
            int numberInput = Integer.valueOf(scanner.nextLine());
            if (numberInput == 0) {
                break;
            }
            if (numberInput > 0 || numberInput < 0) {
                numberOfNumbers = numberOfNumbers + 1;
                sumOfNumbers = sumOfNumbers + numberInput;
                continue;
            }
            
        }
        System.out.println("Number of numbers: " + numberOfNumbers);
        System.out.println("Sum of the numbers: " + sumOfNumbers);
                
               
                
    }
}
