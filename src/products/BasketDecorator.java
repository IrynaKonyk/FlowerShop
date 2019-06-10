package products;

public class BasketDecorator extends ProductDecorator {
    public BasketDecorator(String name, double price, Product product) {
        super(name, price, product);
    }
}
