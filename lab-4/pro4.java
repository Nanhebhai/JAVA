// Input Length and Breadth of  a rectangle ,calculate area and perimeter.
import java.util.Scanner;
public class pro4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for length
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Taking input for breadth
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculating the area
        double area = length * breadth;

        // Calculating the perimeter
        double perimeter = 2 * (length + breadth);

        // Printing the area and perimeter
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        scanner.close();
    }
}