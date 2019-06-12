package payment;

public class CreditCardPaymentStrategy implements IPaymentStrategy {
    @Override
    public void pay(double price) {
        System.out.println("Paid by credit card");


    }


}
