
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year: ");
        int year = Integer.valueOf(scan.nextLine());
        // check if int year is divisible by 100 and 400
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("The year is a leap year.");
        // check if year is only divisible by 100
        } else if (year % 100 == 0) {
            System.out.println("The year is not a leap year.");
        // check if year is divisable by 4
        } else if (year % 4 == 0) {
            System.out.println("The year is a leap year.");
        
        } else {
            System.out.println("The year is not a leap year.");
        }
        
    }
}
