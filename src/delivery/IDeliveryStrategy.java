package delivery;

public interface IDeliveryStrategy {
    public void getOrder();
    public void deliverOrder();
    public boolean sendBackReceivingConfirm();
}
