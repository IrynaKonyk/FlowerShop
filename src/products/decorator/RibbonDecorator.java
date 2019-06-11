package products.decorator;

import products.Product;

public class RibbonDecorator extends ProductDecorator {
    private Product product;
    public RibbonDecorator(Product product) {
        this.product = product;
    }
    @Override
    public String getDescription() {
        return "Ribbon Decoration";
    }

    @Override
    public double price() {
        return (40 + product.price());
    }

    @Override
    public String toString() {
        return "RibbonDecorator{" +
                "description=" + getDescription() +
                "product=" + product +
                '}';
    }


}
