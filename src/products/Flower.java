package products;

import enums.CountryEnum;
import properties.IProperties;

public class Flower extends Plant {
    private IProperties properties;

    public Flower(String description, int amount, double price, CountryEnum producingCountry, IProperties properties) {
        super(description, amount, price, producingCountry);
        this.properties = properties;

    }


    public IProperties getProperties() {
        return properties;
    }

    public void setProperties(IProperties properties) {
        this.properties = properties;
    }

    @Override
    public double price() {
        return getPrice();
    }

    @Override
    public String toString() {
        return "Flower{" +
                "description=" + getDescription() +
                ", amount="+ getAmount()+
                ", price=" + price() +
                ", producingCountry=" + getProducingCountry() +
                properties +
                '}';
    }
}
