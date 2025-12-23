// Count Digits of a Number
public class pro6 {
    public static void main(String[] args) {
        int number = 12345; // Example number
        int count = 0;

        while (number != 0) {
            number /= 10; // Remove the last digit
            count++; // Increment the count
        }

        System.out.println("Number of digits: " + count);
    }
}