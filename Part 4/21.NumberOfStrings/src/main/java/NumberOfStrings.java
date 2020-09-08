
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index= 0;
                        
        while(true){
            String in = scanner.nextLine();
            if(in.equals("end")){
                break;
            }
            index++;
        }
        
        System.out.println(index);
        
    }
}
