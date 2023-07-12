package org.example.ServicesImpl;

import org.example.Entities.Customer;
import org.example.Entities.Product;
import org.example.Sales;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.example.Entities.Store.customersList;

public class PriorQueue implements Sales {
    public static Queue<Product> productQueue = new PriorityQueue<>(Collections.reverseOrder());
    @Override
    public void attendToCustomer() {
        for (Customer x : customersList) {
            for (Product p : x.getCart()){
                productQueue.offer(p);
            }
        }
        while (productQueue.peek() != null){
            System.out.println(productQueue.poll());
        }
    }
     // Task 4: Using Lambda expression
//     @Override
//     public void attendToCustomer(){
//     customersList.forEach(customer -> {customer.getCart()
//     .forEach(product -> {productQueue.offer(product);} );
//     });
//     productQueue.stream().forEach(System.out::println);
//     }
}
