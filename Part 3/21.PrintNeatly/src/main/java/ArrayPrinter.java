
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int ind = 0;
        while (ind < array.length) {
            if (ind == array.length - 1) {
                System.out.print(array[ind]);
            } else {
                System.out.print(array[ind] + ", ");
            }
            ind++;
        }
    }
}
