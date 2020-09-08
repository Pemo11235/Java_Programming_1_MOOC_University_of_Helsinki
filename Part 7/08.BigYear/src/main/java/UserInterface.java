
import java.util.ArrayList;
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

    private Scanner scanner;
    private ArrayList<Bird> birds;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String cmd = askWord();

            if (cmd.equals("Add")) {
                addCMD();
                continue;
            }
            if (cmd.equals("Observation")) {
                obsCMD();
                continue;
            }
            if (cmd.equals("All")) {
                allCMD();
                continue;
            }
            if (cmd.equals("One")) {
                oneCMD();
                continue;
            }
            break;
        }
    }

    public String askWord() {
        String wrd = scanner.nextLine();
        return wrd;
    }

    public void addCMD() {
        System.out.print("Name: ");
        String name = askWord();
        System.out.print("Name in Latin: ");
        String latin = askWord();
        birds.add(new Bird(name, latin));
    }

    public void obsCMD() {
        System.out.print("Bird? ");
        String name = askWord();
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.setObservations(bird.getObservations()+1);
            } else {
                System.out.println("Not a bird!");
            }
        }
    }
    
    public void allCMD(){
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    public void oneCMD(){
        System.out.print("Bird? ");
        String name = askWord();
        for (Bird bird : birds) {
            if (bird.getName().contains(name)) {
                System.out.println(bird);
            }
        }
    }
}
