
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:  ");
        String string = scan.nextLine();
        
        System.out.println("Give an integer: ");
        int integer = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double: ");
        double floatPoint = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean: ");
        boolean TF = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + floatPoint);
        System.out.println("You gave the boolean " +TF);
        
    }   
}
