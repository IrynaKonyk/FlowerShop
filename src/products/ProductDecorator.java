package products;

public abstract class ProductDecorator extends Product {
    protected Product product;

    public ProductDecorator(String name, double price, Product product) {
        super(name, price);
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


}
