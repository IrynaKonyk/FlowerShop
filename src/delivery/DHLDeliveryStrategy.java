package delivery;

public class DHLDeliveryStrategy implements IDeliveryStrategy {
    @Override
    public void getOrder() {

        System.out.println("DHL Delivery received order from Flower Shop administrator");

    }

    @Override
    public void deliverOrder() {
        System.out.println("Consumer received order from DHL Delivery. Order is successfully delivered");

    }


}
