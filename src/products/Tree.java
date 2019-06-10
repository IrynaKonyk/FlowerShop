package products;

import Enums.CountryEnum;
import properties.PropertiesForTree;

public class Tree extends Plant {
    PropertiesForTree properties;

    public Tree(String name, double price, CountryEnum producingCountry, PropertiesForTree properties) {
        super(name, price, producingCountry);
        this.properties = properties;
    }

    public PropertiesForTree getProperties() {
        return properties;
    }

    public void setProperties(PropertiesForTree properties) {
        this.properties = properties;
    }
}
