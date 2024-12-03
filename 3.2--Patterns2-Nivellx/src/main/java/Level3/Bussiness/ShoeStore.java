package Level3.Bussiness;

import Level3.Bussiness.Interfaces.PaymentMethod;

public class ShoeStore {
    private PaymentProcess paymentProcess;

    public ShoeStore() {
        this.paymentProcess = new PaymentProcess();
    }

    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.payment(amount);
    }

}
