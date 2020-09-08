
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container("First");
        Container second = new Container("Second");

        while (true) {
            System.out.print(first);
            System.out.print(second);

            String input = scan.nextLine();
            System.out.println("");
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            }
            if (command.equals("move")) {
                first.move(amount, second);
            }
            if (command.equals("remove")) {
                second.remove(amount);
            }

        }
    }

}
