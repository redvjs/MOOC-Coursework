
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> items = new ArrayList<>();
        while (true) {
            System.out.println("Identifier?(empty will stop)");
            String id = scanner.nextLine();
            if(id.equals("")){
                break;
            }
            System.out.println("Name?(empty will stop)");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            Archive item = new Archive(id, name);
            
            if(!(items.contains(item))){
                items.add(item);
            
            }else{
                System.out.println("Item already present");
            }

        }
        System.out.println("==Items==");
        for(Archive item: items){
            System.out.println(item);
        }
        

    }
}
