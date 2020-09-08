
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while(true){
            String in = scanner.nextLine();
            
            if(in.equals("")){
                break;
            }
            
            String[] pieces = in.split(",");
            int age = Integer.valueOf(pieces[1]);
            if(max < age){
                max = age;
            }
        }
        
        System.out.println("Age of the oldest: " + max);
    }
}
