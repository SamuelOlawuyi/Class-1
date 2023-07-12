package org.example.Entities;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Product> cart = new ArrayList<>();

    public Customer(String olu) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
//        return "Customer{" +
//                "name='" + name + '\'' +
//                ", cart=" + cart +
//                '}';

        return "Customer name is " + name + " with cart " + cart;
    }

    public void selectItem(Product storeProduct, int noOfItem){
        storeProduct.setUnit(noOfItem);
        storeProduct.setAmount(noOfItem * storeProduct.getUnitPrice());
        cart.add(storeProduct);
    }

}
