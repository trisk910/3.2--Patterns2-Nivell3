package Level3.Bussiness;

import Level3.Bussiness.Interfaces.PaymentMethod;

public class PaymentProcess {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.payment(amount);
    }
}
