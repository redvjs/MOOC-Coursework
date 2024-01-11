
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed: ");
        int speed = Integer.valueOf(scanner.nextLine());
        // sets condition if speed is greater than 120, String speeding ticket! will be printed
        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
        
    }
}
