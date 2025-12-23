// Print sum of digits of a number
public class pro8 {
    public static void main(String[] args) {
        int number = 12345; // Example number
        int sum = 0;

        while (number != 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10; // Remove the last digit
        }

        System.out.println("Sum of digits: " + sum);
    }
}