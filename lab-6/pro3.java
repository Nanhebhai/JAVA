// Print Factorial of a number
public class pro3 {
    public static void main(String[] args) {
        int number = 5; // You can change this number to calculate the factorial of a different number
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}