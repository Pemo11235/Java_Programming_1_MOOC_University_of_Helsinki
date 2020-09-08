
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
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            String cmd = this.takeCommand();
            if (isEnd(cmd)) {
                break;
            }
            if (isAdd(cmd)) {
                add();
                continue;
            }
            if (isSearch(cmd)) {
                String searched = search();

                String translated = translation(searched);
                if (this.isNull(searched, translated)) {

                } else {
                    printTranslation(translated);
                }

                continue;
            }
            unknownCmd();
        }
    }

    public String takeCommand() {
        System.out.print("Command: ");
        String command = scanner.nextLine();
        return command;
    }

    public boolean isEnd(String wordCheck) {
        if (wordCheck.equals("end")) {
            System.out.println("Bye bye!");
            return true;
        }
        return false;
    }

    public boolean isAdd(String wordCheck) {
        if (wordCheck.equals("add")) {
            return true;
        }
        return false;
    }

    public boolean isSearch(String wordCheck) {
        if (wordCheck.equals("search")) {
            return true;
        }
        return false;
    }

    public void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String trasl = scanner.nextLine();
        dictionary.add(word, trasl);
    }

    public String search() {
        System.out.print("To be translated: ");

        String word = scanner.nextLine();

        return word;
    }

    public String translation(String word) {
        String translation = dictionary.translate(word);

        if (translation == null) {
            return null;
        }
        return translation;
    }

    public void printTranslation(String word) {
        if (word == null) {
            word = "null";
        }
        System.out.println("Translation: " + word);
    }

    public boolean isNull(String searched, String word) {
        if (word == null) {
            System.out.println("Word " + searched + " was not found");
            return true;
        }

        return false;
    }

    public void unknownCmd() {
        System.out.println("Unknown command");
    }
}
