package shop;

import delivery.IDeliveryStrategy;
import payment.IPaymentStrategy;
import products.Product;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> orders;
    private IPaymentStrategy paymentStrategy;
    private IDeliveryStrategy deliveryStrategy;

    public Order() {

        orders =new ArrayList<>();
    }

    public void setPaymentStrategy(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setDeliveryStrategy(IDeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }
    public double calculateTotalPrice(){
        double totalPrice=0;
        for (Product product:
                orders
             ) {
            totalPrice+=product.price();
        }
        return totalPrice;
    }
    public void addProduct(Product product) {
        orders.add(product);
    }
    public void removeProduct(Product product) {
        orders.remove(product);
    }

}
