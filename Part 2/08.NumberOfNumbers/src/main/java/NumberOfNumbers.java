
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        
        while(true){
            System.out.println("Give a number:");
            int in = Integer.valueOf(scanner.nextLine());
            
            if (in == 0){
                break;
            } else {
                count = count + 1;
            }
        }
        
        System.out.println("Number of numbers: "+count);
    }
}
