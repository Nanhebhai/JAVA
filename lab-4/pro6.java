// Input principal,rate and time to calculate simple interest.
import java.util.Scanner;
public class pro6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Taking input for rate of interest
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        // Taking input for time period
        System.out.print("Enter the time period in years: ");
        double time = scanner.nextDouble();

        // Calculating simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Printing the simple interest
        System.out.println("The simple interest is: " + simpleInterest);

        scanner.close();
    }
}