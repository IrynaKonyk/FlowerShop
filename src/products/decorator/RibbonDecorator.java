package products;

public class RibbonDecorator extends ProductDecorator {
    public RibbonDecorator(String description, Product product) {
        super(description, product);
    }

    @Override
    public double price() {
        return (40+product.price());
    }

    @Override
    public String toString() {
        return "RibbonDecorator{" +
                "description=" + getDescription() +
                "product=" + product +
                '}';
    }
}
