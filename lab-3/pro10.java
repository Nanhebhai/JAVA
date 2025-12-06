// Write a program to calculate reminder without using modulus operator
import java.util.Scanner;
public class pro10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend (numerator): ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor (denominator): ");
        int divisor = scanner.nextInt();

        // Calculate remainder without using modulus operator
        int quotient = dividend / divisor;
        int remainder = dividend - (quotient * divisor);

        System.out.println("The remainder of " + dividend + " divided by " + divisor + " is: " + remainder);

        scanner.close();
    }
}