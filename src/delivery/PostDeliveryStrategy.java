package delivery;

public class PostDeliveryStrategy implements IDeliveryStrategy {
    @Override
    public void getOrder() {

        System.out.println("Post Delivery received order from Flower Shop administrator");

    }

    @Override
    public void deliverOrder() {
        System.out.println("Consumer received order from Post Delivery. Order is successfully delivered");

    }
}
