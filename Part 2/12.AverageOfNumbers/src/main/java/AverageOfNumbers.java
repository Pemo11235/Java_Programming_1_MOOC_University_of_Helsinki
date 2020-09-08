
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0, count = 0;

        while (true) {
            System.out.println("Give a number:");
            int in = Integer.valueOf(scanner.nextLine());

            if (in == 0) {
                break;
            } else {
                count++;
                sum += in;
            }
        }
        if (count > 1){
            double average = (double) sum / count;
            System.out.println("Average of the numbers: " + average);
        } else {
            System.out.println("Average of the numbers: " + (double)sum);
        }
        
    }
}
