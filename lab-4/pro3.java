// Input radius of a circle and find its area.
import java.util.Scanner;
public class pro3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculating the area
        double area = Math.PI * radius * radius;

        // Printing the area
        System.out.println("The area of the circle is: " + area);

        scanner.close();
    }
}