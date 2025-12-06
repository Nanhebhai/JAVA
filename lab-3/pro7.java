// Demonstrate the increment an decrement operators.
import java.util.Scanner;
public class pro7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Demonstrate increment operator
        System.out.println("Original number: " + number);
        System.out.println("After incrementing (number++): " + (number++));
        System.out.println("Value after increment operation: " + number);

        // Reset number for decrement demonstration
        number = scanner.nextInt();
        System.out.println("Reset number: " + number);

        // Demonstrate decrement operator
        System.out.println("After decrementing (number--): " + (number--));
        System.out.println("Value after decrement operation: " + number);

        scanner.close();
    }
}