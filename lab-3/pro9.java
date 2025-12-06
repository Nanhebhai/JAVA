// Write a program to Demonstrate the logical operatore(AND, OR, NOT).
import java.util.Scanner;
public class pro9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first boolean value (true/false): ");
        boolean bool1 = scanner.nextBoolean();

        System.out.print("Enter second boolean value (true/false): ");
        boolean bool2 = scanner.nextBoolean();

        // Demonstrate logical AND operator
        System.out.println("Logical AND (bool1 && bool2): " + (bool1 && bool2));

        // Demonstrate logical OR operator
        System.out.println("Logical OR (bool1 || bool2): " + (bool1 || bool2));

        // Demonstrate logical NOT operator
        System.out.println("Logical NOT (!bool1): " + (!bool1));
        System.out.println("Logical NOT (!bool2): " + (!bool2));

        scanner.close();
    }
}