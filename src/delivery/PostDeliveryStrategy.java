package delivery;

import products.Product;

import java.util.ArrayList;

public class PostDeliveryStrategy implements IDeliveryStrategy {
    @Override
    public void deliver(ArrayList<Product> products) {

        System.out.println("Delivered by Post Delivery");

    }

}
