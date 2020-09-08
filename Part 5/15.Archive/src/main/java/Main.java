
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            items.add(new Item(id, name));

        }

        printItems(items);
    }

    public static void printItems(ArrayList<Item> items) {
        System.out.println("==Items==");
        ArrayList<Item> toPrint = new ArrayList<>();
        for (Item item : items) {
            if (!(toPrint.contains(item))) {
                toPrint.add(item);
            }
        }
        
        for (Item item:toPrint){
            System.out.println(item);
        }
    }
}
