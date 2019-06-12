package delivery;

import products.Product;

import java.util.ArrayList;

public interface IDeliveryStrategy {
    public void deliver(ArrayList<Product> products);


}
