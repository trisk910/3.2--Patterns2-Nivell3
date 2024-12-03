package Level3.Bussiness;

import Level3.Bussiness.Interfaces.PaymentMethod;

public class CreditCard implements PaymentMethod {
    private String number;
    private String nameHolder;
    private String expirationDate;
    private String cvv;

    public CreditCard(String number, String nameHolder, String expirationDate, String cvv) {
        this.number = number;
        this.nameHolder = nameHolder;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public void payment(double amount) {
        System.out.println("Payment of " + amount + " done with Credit Card");
    }
}
