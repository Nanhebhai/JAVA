// Input side of a square to calculate area and perimeter.
import java.util.Scanner;
public class pro8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for side
        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();

        // Calculating the area
        double area = side * side;

        // Calculating the perimeter
        double perimeter = 4 * side;

        // Printing the area and perimeter
        System.out.println("The area of the square is: " + area);
        System.out.println("The perimeter of the square is: " + perimeter);

        scanner.close();
    }
}