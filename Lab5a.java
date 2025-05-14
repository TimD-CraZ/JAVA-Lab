package Tanmay;

import java.util.Vector;

class Product {
    String name;
    double price;
    String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}

public class Lab5a {
    private Vector<Product> inventory;

    public Lab5a() {
        inventory = new Vector<>();
    }

    public void addProduct(String name, double price, String category) {
        Product product = new Product(name, price, category);

        inventory.add(product);
    }

    public void removeProduct(String name) {
        for(int i = 0; i < inventory.size(); i++) {
            if(inventory.get(i).name.equalsIgnoreCase(name)) {
                inventory.remove(i);
                break;
            }
        }
    }
    public void displayInventory() {
        System.out.println("Inventory:");
        for(Product product : inventory) {
            System.out.println("Name" + product.name + "Price:" + product.price + "Category:" + product.category);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Lab5a manager = new Lab5a();

        manager.addProduct("Laptop", 40000, "Electronics");
        manager.addProduct("T-Shirt", 550, "Clothing");
        manager.addProduct("Book", 920, "Books");
        manager.displayInventory();

        manager.removeProduct("Book");
        manager.displayInventory();

        manager.removeProduct("Laptop");
        manager.displayInventory();
    }
}

//develope an online shopping platform to namage a dynamic list of products available for sale
//i) implement a program called online shopping manager that ises a vector to store aproducts object. each product should have attributes for name procr and category
//ii)design method in the on line shopping manager class to addd productas to the inventory, remove products and display all products in the inventory.
