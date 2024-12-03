package Level3.Bussiness;

import Level3.Bussiness.Interfaces.PaymentMethod;

public class Paypal implements PaymentMethod {
    private String email;
    private String password;

    public Paypal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void payment(double amount) {
        System.out.println("Payment of " + amount + " done with Paypal");
    }
}
