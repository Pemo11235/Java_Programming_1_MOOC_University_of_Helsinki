
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        
        while(true){
            System.out.println("Give a number:");
            int in = Integer.valueOf(scanner.nextLine());
            
            if (in == 0){
                break;
            } else if (in < 0){
                count = count + 1;
            } else {
                continue;
            }
        }
        
        System.out.println("Number of negative numbers: "+count);
    }
}
