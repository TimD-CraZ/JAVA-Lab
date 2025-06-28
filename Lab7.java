import java.util.*;

class Item {
    int id;
    String name;
    int qty;
    double price;

    Item(int id, String name, int qty, double price) {
        this.id = id; this.name = name; this.qty = qty; this.price = price;
    }
    void show() {
        System.out.println("id: " + id + " Name: " + name + " Quantity: " + qty + " Price: " + price);
    }
}

public class Lab7 {
    Vector<Item> inv = new Vector<>();

    void add(int id, String name, int qty, double price) {
        inv.add(new Item(id, name, qty, price));
    }

    void update(int id, String name, int qty, double price) {
        for (Item i : inv) 
            if (i.id == id) { 
                i.name = name; i.qty = qty; i.price = price;
            }
    }

    void remove(int id) {
        inv.removeIf(i -> i.id == id);
    }

    void showAll() {
        for (Item i : inv) i.show();
    }

    public static void main(String[] args) {
        Lab7 l = new Lab7();

        l.add(1, "Pen", 10, 5.5);
        l.add(2, "Book", 4, 30);
        l.update(1, "Pen Blue", 12, 6);
        l.remove(2);
        l.showAll();
    }
}