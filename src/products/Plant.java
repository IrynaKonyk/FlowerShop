package products;

import Enums.CountryEnum;

public abstract class Plant extends Product {
    private CountryEnum producingCountry;
    abstract double price();

    public Plant(String description, double price, CountryEnum producingCountry) {
        super(description, price);
        this.producingCountry = producingCountry;
    }

    public CountryEnum getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(CountryEnum producingCountry) {
        this.producingCountry = producingCountry;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name=" + getDescription() +
                ", price=" + getPrice() +
                ", producingCountry=" + producingCountry +
                '}';
    }
}

