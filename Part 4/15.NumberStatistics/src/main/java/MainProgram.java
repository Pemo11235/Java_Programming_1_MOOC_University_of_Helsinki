
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics sumTot = new Statistics();
        Statistics sumEven = new Statistics();
        Statistics sumOdd = new Statistics();

        System.out.println("Enter numbers: ");
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num < 0) {
                break;
            }
            sumTot.addNumber(num);
            if(num % 2 == 0){
                sumEven.addNumber(num);
            } else {
                sumOdd.addNumber(num);
            }
            
        }

        System.out.println("Sum: " + sumTot.sum());
        System.out.println("Sum of even numbers: " + sumEven.sum());
        System.out.println("Sum of odd numbers: "+ sumOdd.sum());
    }
}
