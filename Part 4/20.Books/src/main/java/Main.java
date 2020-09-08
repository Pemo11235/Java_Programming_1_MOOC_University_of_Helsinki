import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        // implement here the program that allows the user to enter 
        // book information and to examine them

        while(true){
            System.out.println("Title: ");
            String name = scan.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scan.nextLine());
            
            books.add(new Book(name,pages,year));
        }
        
        System.out.println("What information will be printed? ");
        String answ = scan.nextLine();
        if(answ.equals("everything")){
            for(Book book:books){
                System.out.println(book);
            }
        } else if(answ.equals("name")){
            for(Book book:books){
                System.out.println(book.getName());
            }
        }
    }
}
