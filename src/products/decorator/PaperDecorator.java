package products;

public class PaperDecorator extends ProductDecorator {

    public PaperDecorator(String description, Product product) {
        super(description, product);
    }

    @Override
    public double price() {
        return (4+product.price());
    }

    @Override
    public String toString() {
        return "PaperDecorator{" +
                "description=" + getDescription()+
                ",product=" + product +
                '}';
    }
}
