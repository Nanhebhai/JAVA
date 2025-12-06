// Khul Ja Sim Sim Password Checker with for loop

import java.util.Scanner;

public class pro1 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = p.nextLine();
        for (int i = 0; i < 3; i++) {
            if (password.equals("KhulJaSimSim")) {
                System.out.println("Welcome.");
                break;
            } else {
                if (i == 2) {
                    System.out.println("Chal Bhag Yaha Se.");
                    break;
                } else {
                    System.out.println("try again");
                }
            }
        }

        p.close();
    }
}