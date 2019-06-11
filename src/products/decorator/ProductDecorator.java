package products;

public abstract class ProductDecorator extends Product {
    protected Product product;

    public ProductDecorator(String description, Product product) {
        super(description);
        this.product=product;
    }
    public abstract double price();

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductDecorator{" +
                "description=" + getDescription() +
                ",product=" + product +
                '}';
    }
}
