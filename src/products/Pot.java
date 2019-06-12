package products;

import enums.ColorEnum;
import enums.MaterialEnum;

public class Pot extends Product {
    private double price;
    private double capacity;
    private ColorEnum color;
    private MaterialEnum potMaterial;

    public Pot(String description, int amount, double price, double capacity, ColorEnum color, MaterialEnum potMaterial) {
        super(description,amount);
        this.price=price;
        this.capacity = capacity;
        this.color = color;
        this.potMaterial = potMaterial;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public MaterialEnum getPotMaterial() {
        return potMaterial;
    }

    public void setPotMaterial(MaterialEnum potMaterial) {
        this.potMaterial = potMaterial;
    }


    @Override
    public double price() {
        return getPrice();
    }


    @Override
    public String toString() {
        return "Pot{" +
                "description=" + getDescription() +
                ", amount="+ getAmount()+
                ", price=" + price() +
                ", capacity=" + capacity +
                ", color=" + color +
                ", potMaterial=" + potMaterial +
                '}';
    }


}
