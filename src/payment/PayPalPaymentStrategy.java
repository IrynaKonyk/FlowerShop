package payment;

//abstract because PayPal is just in progress
public abstract class PayPalPaymentStrategy implements IPaymentStrategy {
    @Override
    public void getMoneyFromCustomer() {

    }

    @Override
    public void sendMoneyToShop() {

    }
}
