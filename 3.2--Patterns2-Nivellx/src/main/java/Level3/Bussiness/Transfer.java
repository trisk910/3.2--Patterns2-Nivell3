package Level3.Bussiness;

import Level3.Bussiness.Interfaces.PaymentMethod;

public class Transfer implements PaymentMethod {
    private String bankNumber;
    private String agency;

    public Transfer(String bankNumber, String agency) {
        this.bankNumber = bankNumber;
        this.agency = agency;
    }

    @Override
    public void payment(double amount) {
        System.out.println("Payment of " + amount + " done with Transfer");
    }
}
