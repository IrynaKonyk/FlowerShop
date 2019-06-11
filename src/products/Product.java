package products;
//abstract class, which is common for all goods in shop
//it has only description of goods and its method to calculate price.
public abstract class Product {
    private String description;

    public Product() {
    }

    public Product(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public abstract double price();
    @Override
    public String toString() {
        return "Product{" +
                "description=" + description +
                '}';
    }
}
