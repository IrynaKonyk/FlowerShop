public abstract class Product {
    //abstract class, which is common for all goods in shop
    //it has only name of goods and its price.
    private Enum name;
    private double price;

    public Product(Enum name, double price) {
        this.name = name;
        this.price = price;
    }

    public Enum getName() {
        return name;
    }

    public void setName(Enum name) {
        this.name = name;
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
                "name=" + name +
                ", price=" + price +
                '}';
    }
}
