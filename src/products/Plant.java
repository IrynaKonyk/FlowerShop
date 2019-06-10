package products;

import Enums.CountryEnum;

public abstract class Plant extends Product {
    private CountryEnum producingCountry;

    public Plant(String name, double price, CountryEnum producingCountry) {
        super(name, price);
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
        return "Product{" +
                "name=" + getName() +
                ", price=" + getPrice() +
                ", producingCountry=" + producingCountry +
                '}';
    }
}

