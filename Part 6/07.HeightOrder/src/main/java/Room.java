
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
public class Room {

    private ArrayList<Person> list;

    public Room() {
        this.list = new ArrayList<>();
    }

    public void add(Person person) {
        list.add(person);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return list;
    }

    public Person shortest() {
        if (this.list.isEmpty()) {
            return null;
        }

        Person retPer = list.get(0);
        for (Person person : list) {
            if (retPer.getHeight() > person.getHeight()) {
                retPer = person;
            }
        }

        return retPer;
    }

    public Person take() {
        if (this.isEmpty()) {
            return null;
        }
        Person deleteThis = this.shortest();

        this.list.remove(deleteThis);
        return deleteThis;  
    }
}
