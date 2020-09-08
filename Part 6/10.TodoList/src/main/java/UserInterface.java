
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matte
 */
public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        
        while(true){
            System.out.print("Command: ");
            String cmd = scanner.nextLine();
            if(cmd.equals("stop")){
                break;
            }
            
            if(cmd.equals("add")){
                toAdd();
                continue;
            }
            
            if(cmd.equals("list")){
                toList();
                continue;
            }
            
            if(cmd.equals("remove")){
                toRemove();
                continue;
            }
            
            unknownCmd();
        }
    }
    
    public void toAdd(){
        System.out.print("To add:");
        String in = scanner.nextLine();
        list.add(in);
    }
    
    public void toList(){
        list.print();
    }
    
    public void toRemove(){
        System.out.print("Which one is removed? ");
        int in = Integer.valueOf(scanner.nextLine());
        list.remove(in);
    }
    
    public void unknownCmd(){
        System.out.println("Unknown command ");
    }
}
