
public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }

    public static void printFromNumberToOne(int num) {
        while (true) {
            if (num == 0) {
                break;
            }
            System.out.println(num);
            num--;

        }
    }
}
