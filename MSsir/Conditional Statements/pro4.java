// Khul Ja Sim Sim Password Checker

import java.util.Scanner;

public class pro4 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = p.nextLine();
        if (password.equals("KhulJaSimSim")) {
            System.out.println("Welcome.");
        } else {
            System.out.println("Chal Bhag Yaha Se");
        }

        p.close();
    }
}