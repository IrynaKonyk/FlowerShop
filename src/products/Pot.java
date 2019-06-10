package products;

import Enums.ColorEnum;
import Enums.MaterialEnum;

public class Pot extends Product {
    private double capacity;
    private ColorEnum color;
    private MaterialEnum potMaterial;

    public Pot(String name, double price, double capacity, ColorEnum color, MaterialEnum potMaterial) {
        super(name, price);
        this.capacity = capacity;
        this.color = color;
        this.potMaterial = potMaterial;
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
    public String toString() {
        return "Product{" +
                "name=" + getName() +
                ", price=" + getPrice() +
                ", capacity=" + capacity +
                ", color=" + color +
                ", potMaterial=" + potMaterial +
                '}';
    }
}
