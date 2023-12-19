
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(10);
        list.add(22);
        list.add(4);
        list.add(50);
        list.add(66);
        
        System.out.println("The numbers in the range [0, 10]");
        printNumbersInRange(list, 0, 10);
        
        System.out.println("The numbers in the range[10, 100]");
        printNumbersInRange(list, 10, 100);
        
        
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number: numbers) {
            if (number <= upperLimit && number >= lowerLimit) {
                System.out.println(number);
            }
        }
        
        
        
    }
    
}
