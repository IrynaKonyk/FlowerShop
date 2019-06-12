package products;

import enums.CountryEnum;
import properties.PropertiesForPalms;

public class Palm extends Plant {
    PropertiesForPalms properties;

    public Palm(String description, double price, CountryEnum producingCountry, PropertiesForPalms properties) {
        super(description, price, producingCountry);
        this.properties = properties;
    }

    public PropertiesForPalms getProperties() {
        return properties;
    }

    public void setProperties(PropertiesForPalms properties) {
        this.properties = properties;
    }

    @Override
    public double price() {
        return getPrice();
    }

    @Override
    public String toString() {
        return "Palm{" +
                "properties=" + properties +
                '}';
    }
}
