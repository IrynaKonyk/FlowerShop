package payment;

public class CreditCardPaymentStrategy implements IPaymentStrategy {
    @Override
    public void getMoneyFromCustomer() {
        System.out.println("Money were taken from Customer`s credit card");


    }

    @Override
    public void sendMoneyToShop() {
        System.out.println("Money were sent to Shop`s Bank Account");

    }
}
