
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = String.valueOf(scanner.nextLine()) ;
            String[] split = input.split(" ");
            String empty = "";
          
            if (input.equals("")) {
                break;
            }
            for(String word: split) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }

    }
}
