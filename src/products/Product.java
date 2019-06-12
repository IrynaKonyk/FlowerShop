package products;
public abstract class Product {
    private String description;
    private int amount;

    public Product() {
    }

    public Product(String description, int amount) {
        this.description = description;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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
                ", amount="+ amount+
                '}';
    }
}
