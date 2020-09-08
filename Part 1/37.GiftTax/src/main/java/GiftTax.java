
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double gift = Double.valueOf(scan.nextLine());
        double tax = 0.0;
        if (gift < 5000.0) {
            System.out.println("No tax !");
        } else if (gift < 25000.0) {
            tax = (100.0 + (gift - 5000.0) * 0.08);
            System.out.println("Tax: " + tax);
        } else if (gift < 55000.0) {
            tax = (1700.0 + (gift - 25000.0) * 0.10);
            System.out.println("Tax: " + tax);
        } else if (gift < 200000.0) {
            tax = (4700.0 + (gift - 55000.0) * 0.12);
            System.out.println("Tax: " + tax);
        } else if (gift < 1000000.0) {
            tax = (22100.0 + (gift - 200000.0) * 0.15);
            System.out.println("Tax: " + tax);
        } else if (gift > 1000000.0) {
            tax = (142100.0 + (gift - 1000000.0) * 0.17);
            System.out.println("Tax: " + tax);
        }

    }
}
