package org.example.Entities;

import org.example.ServicesImpl.FIFOImpl;
import org.example.ServicesImpl.PriorQueue;

import java.io.IOException;

import static org.example.Entities.Store.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        new ProductReader();
        System.out.println(products);
        Customer customer1 = new Customer("Olu");
        customer1.selectItem(products.get(3), 3);
        customersList.add(customer1);

        Customer customer2 = new Customer("Tolu");
        customer2.selectItem(products.get(2), 2);
        customersList.add(customer2);

        Customer customer3 = new Customer("Bolu");
        customer3.selectItem(products.get(4), 7);
        customersList.add(customer3);

        FIFOImpl fifo = new FIFOImpl();
        fifo.attendToCustomer();
        System.out.println(availableUnit);

        PriorQueue priorQueue = new PriorQueue();
        priorQueue.attendToCustomer();
        System.out.println(availableUnit);
    }
}