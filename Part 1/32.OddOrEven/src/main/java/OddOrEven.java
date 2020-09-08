
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int num = Integer.valueOf(scan.nextLine());
        int isEven = num % 2;
        
        if (isEven == 0){
            System.out.println("Number "+ num +" is even.");
        } else {
            System.out.println("Number "+ num +" is odd.");
        }
    }
}
