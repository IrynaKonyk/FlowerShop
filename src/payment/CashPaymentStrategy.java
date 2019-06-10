package payment;

public class CashPaymentStrategy implements IPaymentStrategy {
    @Override
    public void getMoneyFromCustomer() {
        System.out.println("Customer payed cash");

    }

    @Override
    public void sendMoneyToShop() {
        System.out.println("Shop Administrator received cash from customer");

    }
}
