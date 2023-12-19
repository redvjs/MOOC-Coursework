
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longest = "";
        int sum = 0;
        int counter = 0;
        while (true) {
            String input = String.valueOf(scanner.nextLine()) ;
            if (input.equals("")) {
                break;
            }
            String[] split = input.split(",");
            int year = Integer.valueOf(split[1]);
            sum = sum + year;
            
            int length = split[0].length();
            
            if(length > longest.length()){
                longest = split[0];
            }
            counter ++;    
             
        }
        float average = sum/(float)counter;
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + average);
                

    }
}
