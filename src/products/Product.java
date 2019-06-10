package products;
//abstract class, which is common for all goods in shop
//it has only description of goods and its price.
public abstract class Product {
    private String description;
    private double price;
    abstract double price();

    public Product(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description=" + description +
                ", price=" + price +
                '}';
    }
}
