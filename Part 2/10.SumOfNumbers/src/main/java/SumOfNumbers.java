
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        
        while(true){
            System.out.println("Give a number:");
            int in = Integer.valueOf(scanner.nextLine());
            
            if (in == 0){
                break;
            } else {
                sum = sum + in;
                continue;
            }
        }
        
        System.out.println("Sum of the numbers: "+sum);
    }
}
