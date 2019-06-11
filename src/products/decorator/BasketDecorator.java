package products;

public class BasketDecorator extends ProductDecorator {

    public BasketDecorator(String description, Product product) {
        super(description, product);
    }
    @Override
    public double price() {
        return (13+product.price());
    }

    @Override
    public String toString() {
        return "BasketDecorator{" +
                "description=" + getDescription() +
                ",product=" + product +
                '}';
    }
}
