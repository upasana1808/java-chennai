package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotal() {

        double total = 0;

        for (Product product : products) {
            total += product.getPrice();
        }

        return total;
    }
    public double getTotal(String customerType) {

        double total = getTotal();

        if (customerType.equals("PREMIUM")) {
            total = total * 0.90;
        }

        return total;
    }
}