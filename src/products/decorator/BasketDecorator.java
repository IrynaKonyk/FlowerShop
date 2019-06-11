package products.decorator;

import products.Product;

public class BasketDecorator extends ProductDecorator {
    private Product product;

    public BasketDecorator(Product product) {
         this.product=product;
    }
    @Override
    public String getDescription() {
        return "Basket Decoration";
    }
    @Override
    public double price() {
        return (13 + product.price());
    }

    @Override
    public String toString() {
        return "BasketDecorator{" +
                "description=" + getDescription() +
                ",product=" + product +
                '}';
    }


}
