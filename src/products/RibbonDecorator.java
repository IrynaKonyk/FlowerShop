package products;

public class RibbonDecorator extends ProductDecorator {
    public RibbonDecorator(String name, double price, Product product) {
        super(name, price, product);
    }
}
