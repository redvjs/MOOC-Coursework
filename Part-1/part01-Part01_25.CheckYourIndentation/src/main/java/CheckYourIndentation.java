import java.util.Scanner;

public class CheckYourIndentation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number: ");
        int first = Integer.valueOf(scan.nextLine());
        System.out.println("Give another number: ");
        int second = Integer.valueOf(scan.nextLine());
        // if two values are equal, print "same"
        if (first == second) {
            System.out.println("Same!");
        // if not equal, check if first value is greater, if true print 1 > 2    
        } else if (first > second) {
            System.out.println("The first was larger than the second!");
        // else if neither of these checks true, print second is larger.
        } else {
            System.out.println("The second was larger than the first!");
        }

    }
}
