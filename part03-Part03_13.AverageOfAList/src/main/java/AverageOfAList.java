
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        int total = 0;
        int count = 0;
        
        for (int number: list){
            total += number;
            count += 1;
        }
        float average = total / (float) count;
        System.out.println("Average: " + average);
    }
}
