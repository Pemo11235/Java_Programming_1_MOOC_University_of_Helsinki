
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String value;
        System.out.println("Give a number:");
        value = scanner.nextLine();
        int numValue;
        numValue= Integer.valueOf(value);
        System.out.println("You gave the number " + numValue);

    }
}
