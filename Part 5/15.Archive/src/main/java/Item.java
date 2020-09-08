


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matte
 */
public class Item {
    private String identifier;
    private String name;

    public Item(String identifier) {
        this.identifier = identifier;
    }
        
    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    
    @Override
    public String toString(){
        return this.identifier + ": "+this.name;
    }
    
    @Override
    public boolean equals(Object comp){
        if(this == comp){
            return true;
        }
        
        if(!(comp instanceof Item)){
            return false;
        }
        
        Item compItem = (Item) comp;
        
        return this.identifier.equals(compItem.identifier);
    }
}
