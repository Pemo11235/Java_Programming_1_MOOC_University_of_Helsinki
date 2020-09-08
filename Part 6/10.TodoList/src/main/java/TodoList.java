
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
public class TodoList {

    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        list.add(task);
    }

    public void print() {
        if (!list.isEmpty()) {
            int index = 1;
            for (String task : list) {
                System.out.println(index + ": " + task);
                index++;
            }
        } else {
            System.out.println("To-do list is empty.");
        }

    }

    public void remove(int number) {
        if (number > 0 && number < list.size() + 1) {
            list.remove(number - 1);
        } else {
            System.out.println("Index not valid.");
        }
    }
}
