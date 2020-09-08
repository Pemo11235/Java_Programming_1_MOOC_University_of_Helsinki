
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
public class Package {

    private ArrayList<Gift> pack;

    public Package() {
        this.pack = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        pack.add(gift);

    }

    public int totalWeight() {
        int totWeight=0;
        for (Gift gift : pack) {
            totWeight += gift.getWeight();
        }
        return totWeight;
    }

}
