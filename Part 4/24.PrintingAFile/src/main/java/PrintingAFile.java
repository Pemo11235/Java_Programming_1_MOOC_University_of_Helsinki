
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<>();
        
        try (Scanner scanner  = new Scanner(Paths.get("data.txt"))){
            while(scanner.hasNextLine()){
                String read = scanner.nextLine();
                 all.add(read);
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        for(String one:all){
            System.out.println(one);
        }
        
    }
}
