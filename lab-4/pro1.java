// take input fro name and age, then print them.
import java.util.Scanner;
public class pro1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Taking input for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Printing the name and age
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);

        scanner.close();
    }
}