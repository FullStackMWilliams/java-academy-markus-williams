package com.pluralsight;

import java.io.*;
import java.util.*;

public class SearchInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Products> inventory = getInventory("inventory.csv");

        if (inventory.isEmpty()) {
            System.out.println("No inventory found. Adding default");
            inventory = getDefaultInventory();
        }
        boolean running = true;
        while (running) {
            System.out.println("\n====== Store Inventory Menu ======");
            System.out.println("1. List all products");
            System.out.println("2. Lookup a product by ID");
            System.out.println("3. Find all products within a price range");
            System.out.println("4. Add a new product");
            System.out.println("5. Quit");
            System.out.println("Enter your choice: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    listProducts(inventory);
                    break;
                case "2":
                    lookupByID(scanner, inventory);
                    break;
                case "3":
                    findByPriceRange(scanner, inventory);
                    break;
                case "4":
                    addProduct(scanner, inventory);
                    break;
                case "5":
                    running = false;
                    System.out.println("Exiting...Goodbye.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    public static List<Products> getInventory(String filename) {
        List<Products> products = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split("\\|");

                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    double price = Double.parseDouble(parts[2].trim());
                    products.add(new Products(id, name, price));
                }
            }

            Collections.sort(products);

        }catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }catch (NumberFormatException e) {
            System.out.println("Error parsing number in file. Please check your data.");
        }
        return products;
    }
    public static List<Products> getDefaultInventory() {
        List<Products> items = new ArrayList<>();
        items.add(new Products(1001,"Hammer",19.99));
        items.add(new Products(1002, "Chain-saw",299.95));
        items.add(new Products(1003,"Tape Measurer",7.99));
        items.add(new Products(1004,"Drill",35.89));
        items.add(new Products(1005,"Wrench",6.99));
        return items;
    }
    public static void listProducts(List<Products> products) {
        System.out.println("\n===== INVENTORY LIST ======");
        for (Products products1 : products) {
            System.out.println(products1);
        }
    }
    public static void lookupByID(Scanner scanner, List<Products> products) {
        System.out.println("Enter product ID: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());
            Products found = null;
            for (Products products1 : products) {
                if (products1.getId() == id) {
                    found = products1;
                    break;
                }
            }
            if (found !=null) {
                System.out.println("Found: " + found);
            }else {
                System.out.println("Product not found.");
            }
        }catch (NumberFormatException e) {
            System.out.println("Invalid number. Please enter a valid ID.");
        }
    }
    public static void findByPriceRange(Scanner scanner, List<Products> products) {
        try {
            System.out.println("Enter minimum price: ");
            double min = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter maximum price: ");
            double max = Double.parseDouble(scanner.nextLine());

            System.out.println("\n===== Products in Range ======");
            boolean found = false;
            for (Products product1 : products) {
                if (product1.getPrice() >= min && product1.getPrice() <= max) {
                    System.out.println(product1);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No products found in that range.");
            }
        }catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers");
        }
    }
    public static void addProduct(Scanner scanner, List<Products> products) {
        try {
            System.out.print("Enter new product ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();
            System.out.println("Enter product price: ");
            double price = Double.parseDouble(scanner.nextLine());

            products.add(new Products(id, name, price));
            Collections.sort(products);
            System.out.println("Product added successfully.");

        }catch (NumberFormatException e) {
            System.out.println("Invalid input. Product not added.");
        }
    }
}
