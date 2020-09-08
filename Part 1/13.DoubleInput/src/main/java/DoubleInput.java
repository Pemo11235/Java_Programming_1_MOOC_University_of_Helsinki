
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        System.out.println("Give a number:");
        text = scanner.nextLine();
        double value = Double.valueOf(text);
        System.out.println("You gave the number " + value);

    }
}
