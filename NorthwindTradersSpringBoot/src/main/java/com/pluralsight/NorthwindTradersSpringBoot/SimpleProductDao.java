package com.pluralsight.NorthwindTradersSpringBoot;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component   // tells Spring to manage this as a Bean
public class SimpleProductDao implements ProductDao {

    private List<Product> products = new ArrayList<>();

    public SimpleProductDao() {
        // Seed a few starter products
        products.add(new Product(1, "Laptop", "Electronics", 999.99));
        products.add(new Product(2, "Desk Chair", "Furniture", 149.99));
        products.add(new Product(3, "Coffee Mug", "Kitchen", 9.99));
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}