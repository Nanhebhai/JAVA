// Input marks of five subjects and calculate the percentage.
import java.util.Scanner;
public class pro5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for marks of five subjects
        System.out.print("Enter marks of five subjects: ");
        double subject1 = scanner.nextDouble();

        // System.out.print("Enter marks for subject 2: ");
        double subject2 = scanner.nextDouble();

        // System.out.print("Enter marks for subject 3: ");
        double subject3 = scanner.nextDouble();

        // System.out.print("Enter marks for subject 4: ");
        double subject4 = scanner.nextDouble();

        // System.out.print("Enter marks for subject 5: ");
        double subject5 = scanner.nextDouble();

        // Calculating the total marks
        double totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;

        // Calculating the percentage
        double percentage = (totalMarks / 500) * 100;

        // Printing the percentage
        System.out.println("The percentage is: " + percentage + "%");

        scanner.close();
    }
}