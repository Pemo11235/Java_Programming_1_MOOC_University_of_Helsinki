
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> text = new ArrayList<>();

        System.out.println("Which file should have its contents printed? ");
        String in = scanner.nextLine();
        try( Scanner scanner2 = new Scanner(Paths.get(in))){
            while(scanner2.hasNextLine()){
                String read = scanner2.nextLine();
                text.add(read);
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        for(String line : text){
            System.out.println(line);
        }
    }
}
