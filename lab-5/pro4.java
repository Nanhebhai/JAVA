// Check if a number is divisible byb  both 5 and 7.
import java.util.Scanner;
public class pro4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 7 == 0) {
            System.out.println("The number is divisible by both 5 and 7.");
        } else {
            System.out.println("The number is not divisible by both 5 and 7.");
        }

        scanner.close();
    }
}