package service.impl;

import entities.Product;
import service.ProductService;
import service.ShoppingCart;

public class ProductServiceImpl implements ProductService {
    private ShoppingCart cart;

    public ProductServiceImpl(ShoppingCart cart) {
        this.cart = cart;
    }

    @Override
    public void addProductToCart(Product product, int quantity) {
        for (int i = 0; i < quantity; i++){
            cart.addProduct(product);
        }
    }

    @Override
    public int getAllProductsFormCart() {
        return cart.getTotalProducts();
    }
}
