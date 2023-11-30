package visitor.products;

public abstract class Product {

    protected double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }
}
