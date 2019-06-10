package products;

import java.util.ArrayList;

public class Bouquet extends Product {
    private ArrayList<Flower> flowers;
    private ArrayList<DecorForBouquet> decoration;

    public Bouquet(String name, double price, ArrayList<Flower> flowers, ArrayList<DecorForBouquet> decoration) {
        super(name, price);
        this.flowers = flowers;
        this.decoration = decoration;
    }
}
