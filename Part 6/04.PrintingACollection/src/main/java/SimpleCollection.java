
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String printOutput = "The collection " + this.name;
        String elementsInList = "";

        if (this.elements.isEmpty()) {
            printOutput += " is empty.";
        }
        if (this.elements.size() == 1) {
            printOutput += " has " + this.elements.size() + " element:\n";
            elementsInList = this.elements.get(0);
        }
        if (this.elements.size() > 1) {
            printOutput += " has " + this.elements.size() + " elements:\n";

            for (String element : this.elements) {
                elementsInList = elementsInList + element + "\n";
            }
        }

        return printOutput + elementsInList;
    }

}
