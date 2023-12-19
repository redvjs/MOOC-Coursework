
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = String.valueOf(scanner.nextLine()) ;
            String[] split = input.split(" ");
            String empty = "";
          
            if (input.equals("")) {
                break;
            } else{
                System.out.println(split[0]);
            
            }
        }
    }
}
