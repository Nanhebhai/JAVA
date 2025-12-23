// Input base and height of a triangle to calculate area.
import java.util.Scanner;
public class pro7 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        // Taking input for base
        System.out.print("Enter the base of the triangle: ");
        double base = s1.nextDouble();

        // Taking input for height
        System.out.print("Enter the height of the triangle: ");
        double height = s1.nextDouble();

        // Calculating the area
        double area = 0.5 * base * height;

        // Printing the area
        System.out.println("The area of the triangle is: " + area);

        s1.close();
    }
}