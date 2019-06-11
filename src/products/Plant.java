package products;

import enums.CountryEnum;

public abstract class Plant extends Product {
    private double price;
    private CountryEnum producingCountry;

    public Plant(String description, double price, CountryEnum producingCountry) {
        super(description);
        this.price = price;
        this.producingCountry = producingCountry;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CountryEnum getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(CountryEnum producingCountry) {
        this.producingCountry = producingCountry;
    }
    public double price(){
        return getPrice();
    }

    @Override
    public String toString() {
        return "Plant{" +
                "description=" + getDescription() +
                ", price=" + price +
                ", producingCountry=" + producingCountry +
                '}';
    }
}

