package products;

import java.util.ArrayList;

public class Bouquet extends Product {
    private ArrayList<Flower> flowers;
    private ArrayList<ProductDecorator> decoration;

    public Bouquet(String name, double price, ArrayList<Flower> flowers, ArrayList<ProductDecorator> decoration) {
        super(name, price);
        this.flowers = flowers;
        this.decoration = decoration;
    }
}
