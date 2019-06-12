package payment;
public abstract class PayPalPaymentStrategy implements IPaymentStrategy {
    @Override
    public void pay(double price) {

        System.out.println("Paid with PayPal");


    }


}
