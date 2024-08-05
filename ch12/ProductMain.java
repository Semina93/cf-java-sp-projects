package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.Product;

/**
 * Demonstrates the usage of {@link Product}
 */
public class ProductMain {
    public static void main(String[] args) {
        Product oranges = new Product(1, "oranges", "Yellow oranges", 6.99, 100, true);
        oranges.setPrice(5.99);
        oranges.setQuantity(80);

        System.out.println("Product name: " + oranges.getName());
        System.out.println("Price: " + oranges.getPrice());
    }
}
