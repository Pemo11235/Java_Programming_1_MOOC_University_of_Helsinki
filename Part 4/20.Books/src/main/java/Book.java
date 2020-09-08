/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matte
 */
public class Book {
    private String name;
    private int pages;
    private int pubYear;
    
    public Book(String n, int p, int y){
        this.name = n;
        this.pages = p;
        this.pubYear = y;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public int getPubYear(){
        return this.pubYear;
    }
    
    @Override
    public String toString(){
        return this.name + ", " + this.pages + " pages, " + this.pubYear;
    }
}
