// Write a program to check if a number is divisible by 5 or 11.
public class pro8 {
    public static void main(String[] args) {
        int number = 55; // You can change this value to test with other numbers

        // Check if the number is divisible by 5 or 11
        if (number % 5 == 0 || number % 11 == 0) {
            System.out.println(number + " is divisible by 5 or 11.");
        } else {
            System.out.println(number + " is not divisible by 5 or 11.");
        }
    }
}