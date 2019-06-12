package payment;

public class CashPaymentStrategy implements IPaymentStrategy {
    @Override
    public void pay(double price) {

        System.out.println("Paid with cash");

    }

}
