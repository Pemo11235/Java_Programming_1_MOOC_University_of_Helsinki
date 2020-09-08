
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int in = Integer.valueOf(scanner.nextLine());

            if (in == 0) {
                break;
            } else {
                count = count + 1;
                sum = sum + in;

            }
        }   
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}
