
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int end = 101;
        int num = Integer.valueOf(scanner.nextLine());
        
        for (int i = num; i < end; i++){
            System.out.println(i);
        }
    }
}
