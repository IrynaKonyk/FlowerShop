package products.decorator;

import products.Product;

public class PaperDecorator extends ProductDecorator {
    private Product product;

    public PaperDecorator(Product product) {
        this.product=product;
    }
    @Override
    public String getDescription() {
        return "Paper Decoration";
    }

    @Override
    public double price() {
        return (4 + product.price());
    }

    @Override
    public String toString() {
        return "PaperDecorator{" +
                "description=" + getDescription()+
                ",product=" + product +
                '}';
    }



}
