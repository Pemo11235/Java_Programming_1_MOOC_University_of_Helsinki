/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matte
 */
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private final int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int localMax = this.totalWeight() + item.getWeight();
        if (localMax <= maxWeight) {
            items.add(item);
        }

    }

    @Override
    public String toString() {
        String printOut = "";
        if (items.isEmpty()) {
            printOut = "no items";
        }
        if (items.size() == 1) {
            printOut = "1 item";
        }

        if (items.size() > 1) {
            printOut = items.size() + " items";
        }

        return printOut + " (" + this.totalWeight() + " kg)";
    }

    public int totalWeight() {
        int tot = 0;
        for (Item item : items) {
            tot += item.getWeight();
        }
        return tot;
    }
    
    public void printItems(){
        for(Item item:items){
            System.out.println(item);
        }
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        
        Item heavy = items.get(0);
        
        for(Item item:items){
            if(item.getWeight() > heavy.getWeight()){
                heavy = item;
            }
        }
        
        return heavy;
    }
}
