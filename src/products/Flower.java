package products;

import Enums.CountryEnum;
import properties.IProperties;

public class Flower extends Plant {
    private IProperties properties;

    public Flower(String name, double price, CountryEnum producingCountry, IProperties properties) {
        super(name, price, producingCountry);
        this.properties = properties;
    }

    public IProperties getProperties() {
        return properties;
    }

    public void setProperties(IProperties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "products.Flower{" +
                "name=" + getName() +
                ", price=" + getPrice() +
                ", producingCountry=" + getProducingCountry() +
                ", properties=" + properties +
                '}';
    }
}
