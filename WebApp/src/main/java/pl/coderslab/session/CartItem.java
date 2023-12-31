package pl.coderslab.session;

public class CartItem {
    String productName;
    double quantity;
    double price;

    public CartItem(String productName, double quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "name='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}