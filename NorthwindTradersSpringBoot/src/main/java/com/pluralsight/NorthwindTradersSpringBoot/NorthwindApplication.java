package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class NorthwindApplication implements CommandLineRunner {

    // Class-level variable with @Autowired, as the exercise要求
    @Autowired
    private ProductDao productDao;

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to Northwind Traders Product Admin\n");

        while (running) {
            System.out.println("Please choose an option:");
            System.out.println("1. List Products");
            System.out.println("2. Add Product");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    listProducts();
                    break;
                case "2":
                    addProduct(scanner);
                    break;
                case "3":
                    running = false;
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }

            System.out.println();
        }

        scanner.close();
    }

    private void listProducts() {
        List<Product> products = productDao.getAll();
        if (products.isEmpty()) {
            System.out.println("No products found.");
        } else {
            System.out.println("\n--- Product List ---");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    private void addProduct(Scanner scanner) {
        try {
            System.out.print("Enter product ID (number): ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter product name: ");
            String name = scanner.nextLine();

            System.out.print("Enter product category: ");
            String category = scanner.nextLine();

            System.out.print("Enter product price: ");
            double price = Double.parseDouble(scanner.nextLine());

            Product newProduct = new Product(id, name, category, price);
            productDao.add(newProduct);

            System.out.println("Product added successfully!");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number. Product not added.");
        }
    }
}