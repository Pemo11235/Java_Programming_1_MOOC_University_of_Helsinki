
import java.util.Scanner;

public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }

    public void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
        
        this.printAverageGrades();
        this.printAveragePoints();
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
    
    public void printAveragePoints(){
        System.out.println("The average of points: ");
        double avg = register.averageOfPoints();
        if(avg != -1){
            System.out.println(register.averageOfPoints());
        }else{
            System.out.println("null");
        }   
    }
    
    public void printAverageGrades(){
        System.out.println("The average of grades: ");
        double avg = register.averageOfGrades();
        if(avg != -1){
            System.out.println(register.averageOfGrades());
        }else{
            System.out.println("null");
        }   
    }
}
