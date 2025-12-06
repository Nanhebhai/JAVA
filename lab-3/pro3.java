// Find the Largest of two numbers using Ternary Operator
public class pro3 {
    public static void main(String[] args) {
        int num1 = 10; // You can change this value to test with other numbers
        int num2 = 20; // You can change this value to test with other numbers

        // Find the largest number using Ternary Operator
        int largest = (num1 > num2) ? num1 : num2;

        System.out.println("The largest number between " + num1 + " and " + num2 + " is: " + largest);
    }
}