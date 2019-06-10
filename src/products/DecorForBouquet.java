package products;

import Enums.ColorEnum;

public class DecorForBouquet extends Product {
    private ColorEnum color;

    public DecorForBouquet(String name, double price, ColorEnum color) {
        super(name, price);
        this.color = color;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

}
