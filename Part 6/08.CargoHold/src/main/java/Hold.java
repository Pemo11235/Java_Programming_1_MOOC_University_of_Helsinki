
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matte
 */

public class Hold {
    private ArrayList<Suitcase> suits;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.suits = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(this.totalWeight()+suitcase.totalWeight() <= maxWeight){
            suits.add(suitcase);
        }
    }

    public int totalWeight(){
        int tot = 0;
        for(Suitcase suit : suits){
            tot += suit.totalWeight();
        }
        return tot;
    }
    @Override
    public String toString() {
        return suits.size() + " suitcases (" + this.totalWeight() + " kg )";
    }
    
    public void printItems() {
        for(Suitcase suit : suits){
            suit.printItems();
        }
    }
}
