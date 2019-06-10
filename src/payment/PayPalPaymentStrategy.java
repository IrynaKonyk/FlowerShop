package payment;

//abstract because PayPal is just in progress
public abstract class PayPalPaymentStrategy implements IPaymentStrategy {
    @Override
    public void getMoneyFromCustomer() {
        System.out.println("Money were taken from Customer`s phone account");


    }

    @Override
    public void sendMoneyToShop() {
        System.out.println("Money were sent to Shop`s Bank Account");

    }
}
