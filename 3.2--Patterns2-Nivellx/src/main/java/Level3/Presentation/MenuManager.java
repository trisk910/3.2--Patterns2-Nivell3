package Level3.Presentation;

import java.util.Scanner;

public class MenuManager {
    public int showMainMenu() {
        System.out.println("Main Menu:");
        System.out.println("1. Payment");
        System.out.println("2. Exit");
        return askForInt();
    }

    public int showPaymentMenu() {
        System.out.println("Payment Menu:");
        System.out.println("1. Paypal");
        System.out.println("2. Credit Card");
        System.out.println("3. Transfer");
        System.out.println("4. Exit");
        return askForInt();
    }

    private int askForInt() {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.print("> ");
            int option = scn.nextInt();
            return option;
        } catch (Exception e) {
            return 0;
        }
    }
}
