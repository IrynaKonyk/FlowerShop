package products;

import Enums.CountryEnum;

public class Plant extends Product {
    private CountryEnum producingCountry;


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
    double price() {
        return getPrice();
    }

    @Override
    public String toString() {
        return "Plant{" +
                "description=" + getDescription() +
                ", price=" + price() +
                ", producingCountry=" + producingCountry +
                '}';
    }
}

