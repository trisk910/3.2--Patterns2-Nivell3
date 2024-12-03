package Level3.Presentation;

import Level3.Bussiness.*;
import Level3.Bussiness.Interfaces.PaymentMethod;
import java.util.Scanner;

public class UIController {
    private MenuManager menu;
    ShoeStore store = new ShoeStore();
    Scanner scanner = new Scanner(System.in);
    public UIController(MenuManager menu) {
        this.menu = menu;
    }

    public void start() {
        System.out.println("Wellcome to the shoeStore");
        int mainOption;
        do{
            mainOption = menu.showMainMenu();
            switch (mainOption) {
                case 1:
                    payment();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }while (mainOption != 2);
    }

    private void payment() {
        int paymentOption = menu.showPaymentMenu();
        switch (paymentOption) {
            case 1:
                paypalMethod();
                break;
            case 2:
                creditCardMethod();
                break;
            case 3:
                transferMethod();
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    private void paypalMethod(){
        System.out.println("-- Add Paypal details --");
        System.out.print("Email: ");
        String email = askForString();
        System.out.print("Password: ");
        String password = askForString();
        PaymentMethod paypal = new Paypal(email, password);
        System.out.print("Payment amount: ");
        double amount = askForDouble();
        scanner.nextLine();
        store.processPayment(paypal, amount);
    }

    private void creditCardMethod(){
        System.out.println("-- Add Credit Card details -- ");
        System.out.print("Card Number: ");
        String number = askForString();
        System.out.print("Card Name: ");
        String name = askForString();
        System.out.print("Card Expiration Date: ");
        String exp = askForString();
        System.out.print("Card CCV: ");
        String ccv = askForString();
        PaymentMethod creditCard = new CreditCard(number, name,exp, ccv);
        System.out.print("Payment amount: ");
        double amount = askForDouble();
        scanner.nextLine();
        store.processPayment(creditCard, amount);
    }

    private void transferMethod(){
        System.out.println("-- Add Bank account details -- ");
        System.out.print("Bank Number: ");
        String bankNumber = askForString();
        System.out.print("Agency: ");
        String agency = askForString();
        PaymentMethod transfer = new Transfer(bankNumber, agency);
        System.out.print("Payment amount: ");
        double amount = askForDouble();
        scanner.nextLine();
        store.processPayment(transfer, amount);
    }

    private String askForString() {
        return scanner.nextLine();
    }

    private double askForDouble() {
        return scanner.nextDouble();
    }

}
