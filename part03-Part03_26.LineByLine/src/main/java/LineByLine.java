
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while (true) {
            String input = String.valueOf(scanner.nextLine()) ;
            String[] split = input.split(" ");
            if (split.length == 1) {
                System.out.println(split[0]);
                break;
            }
            for(String word: split) {
            System.out.println(word);
            
        }
            
        }
        
    }
}
