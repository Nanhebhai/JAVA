// Khul Ja Sim Sim Password Checker with nested if-else

import java.util.Scanner;

public class pro5 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = p.nextLine();
        if (password.equals("KhulJaSimSim")) {
            System.out.println("Welcome.");
        } else {
            System.out.println("try again");
            System.out.print("Enter your password: ");
            String password1 = p.nextLine();
            if (password1.equals("KhulJaSimSim")) {
                System.out.println("Password is correct. Access granted.");
            } else {
                System.out.println("try again");
                System.out.print("Enter your password: ");
                String password2 = p.nextLine();
                if (password2.equals("KhulJaSimSim")) {
                    System.out.println("Password is correct. Access granted.");
                } else {
                    System.out.println("Chal Bhag Yaha Se");
                }
            }
        }

        p.close();
    }
}