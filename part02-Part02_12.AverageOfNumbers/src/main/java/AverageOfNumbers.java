
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOfNumbers = 0;
        int sumOfNumbers = 0;
       
        
        while(true){
            System.out.println("Give a number: ");
            int numberInput = Integer.valueOf(scanner.nextLine());
            if (numberInput == 0) {
                break;
            } else {
                numberOfNumbers = numberOfNumbers + 1;
                sumOfNumbers = sumOfNumbers + numberInput;
            }
        }
        System.out.println("Average of the numbers: " + (sumOfNumbers /(double)numberOfNumbers));
    }
        
}
