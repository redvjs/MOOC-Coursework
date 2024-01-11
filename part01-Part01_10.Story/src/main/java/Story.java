
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prints text
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        // assigns user input to variable
        String name = scanner.nextLine();
        // prints text
        System.out.println("What is their job?");
        // assigns user input
        String job = scanner.nextLine();
        // prints story using user input to fill in the blanks.
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + name + ", who was " + job + ".");
        System.out.println("On the way to work, " + name + " reflected on life.");
        System.out.println("Perhaps " + name + " will not be " + job + " forever.");
    }
}
