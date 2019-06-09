public abstract class Product {
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
