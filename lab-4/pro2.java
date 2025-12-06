// Input three numbers and find their sum.
import java.util.Scanner;
public class pro2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Calculating the sum
        int sum = num1 + num2 + num3;

        // Printing the sum
        System.out.println("The sum of the three numbers is: " + sum);

        scanner.close();
    }
}   