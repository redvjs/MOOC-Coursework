
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int first = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number: ");
        int second = Integer.valueOf(scan.nextLine());
        // compare first and second values, print if true
        if (first > second) {
            System.out.println("Greater number is: " + first);
        } else if (second > first) {
            System.out.println("Greater number is: " + second);
        // prints if other two conditions false
        } else {
            System.out.println("The numbers are equal!");
        }
        
    }
}
