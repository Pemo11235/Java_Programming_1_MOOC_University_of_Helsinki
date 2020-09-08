
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");

        removeLast(list);
    }

    public static void removeLast(ArrayList<String> list) {
        if (list.size() != 0) {
            list.remove(list.size() - 1);
        }

    }

}
