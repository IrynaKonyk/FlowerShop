package payment;

//abstract because PayPal is just in progress
public abstract class PayPalPayment implements IPayment {
    @Override
    public void getMoneyFromCustomer() {

    }

    @Override
    public void sendMoneyToShop() {

    }
}
