
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        ArrayList<String> list = new ArrayList<String>();
        try(Scanner scanner = new Scanner(Paths.get(file))){
            System.out.println("Team: ");
            String team = scan.nextLine();
            int played = 0;
            int wins = 0;
            int losses = 0;
            while(scanner.hasNextLine()){
                
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String teamOne = parts[0];
                String teamTwo = parts[1];
                int scoreOne = Integer.valueOf(parts[2]);
                int scoreTwo = Integer.valueOf(parts[3]);
                
                if(teamOne.equals(team) || teamTwo.equals(team)){
                    played ++;
                    if (teamOne.equals(team) && scoreOne>scoreTwo){
                        wins ++;
                    } else if (teamTwo.equals(team) && scoreTwo > scoreOne){
                        wins ++;
                    } else {
                        losses ++;
                    }
                    
                }
                

            }
            System.out.println("Games: " + played);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        }catch (Exception e){
            
        }
    }

}
