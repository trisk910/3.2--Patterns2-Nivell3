package Level1.Presentation;

import java.util.Scanner;

public class MainMenu {
    public int showMainMenu() {
        System.out.println("1. Create pizza");
        System.out.println("2. List Pizzas");
        System.out.println("3. Exit");
        Scanner scn = new Scanner(System.in);
        try {
            int option = scn.nextInt();
            return option;
        } catch (Exception e) {
            return 0;
        }
    }

}
