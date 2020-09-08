
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("Enter password: ");
        String pswrd = scanner.nextLine();
        
        if ((user.equals("alex") && pswrd.equals("sunshine"))||
                (user.equals("emma") && pswrd.equals("haskell")) ) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
