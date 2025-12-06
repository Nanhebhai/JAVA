// Input two integers and print quotient and remainder.
import java.util.Scanner;
public class pro10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for first integer
        System.out.print("Enter the first integer (dividend): ");
        int dividend = scanner.nextInt();

        // Taking input for second integer
        System.out.print("Enter the second integer (divisor): ");
        int divisor = scanner.nextInt();

        // Calculating the quotient
        int quotient = dividend / divisor;

        // Calculating the remainder
        int remainder = dividend % divisor;

        // Printing the quotient and remainder
        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);

        scanner.close();
    }
}