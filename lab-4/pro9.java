// Take a string input and print its first character.
import java.util.Scanner;
public class pro9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Getting the first character
        char firstCharacter = inputString.charAt(0);

        // Printing the first character
        System.out.println("The first character of the string is: " + firstCharacter);

        scanner.close();
    }
}