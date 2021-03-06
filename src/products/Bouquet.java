package products;

import java.util.ArrayList;

public class Bouquet extends Product {
    private ArrayList<Flower> flowers;

    public Bouquet(String description, int amount, ArrayList<Flower> flowers) {
        super(description,amount);
        this.flowers = flowers;
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    public void addFlowers(ArrayList<Flower> flowers2) {
        flowers.addAll(flowers2);
    }

    @Override
    public double price() {
        double totalPrice = 0;
        for (Flower flower : flowers) {
            totalPrice += flower.price();
        }
        return totalPrice;

    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "amount="+ getAmount()+
                "flowers=" + flowers +
                '}';
    }
}
