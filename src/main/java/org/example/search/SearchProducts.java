package org.example.search;

import org.example.product.Product;

public class SearchProducts {

    private int productId;
    private String productName;

    public void getProductById(int productId) {
        System.out.println("finding a product with the id" + productId);
    }
}
