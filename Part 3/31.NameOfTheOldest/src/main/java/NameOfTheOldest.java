
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old = 0;
        String nameOld = "";
        
        while(true){
            String in = scanner.nextLine();
            
            if(in.equals("")){
                break;
            }
            
            String[] parts = in.split(",");
            int tempAge = Integer.valueOf(parts[1]);
            String tempName = parts[0];
            
            if(old < tempAge){
                old = tempAge;
                nameOld = tempName;
            }
            
        }

           System.out.println("Name of the oldest: " + nameOld);
        
    }
}
