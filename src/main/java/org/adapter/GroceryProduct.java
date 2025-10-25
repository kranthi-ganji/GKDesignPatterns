package org.adapter;

public class GroceryProduct implements GroceryItem {
    private String name;

    public GroceryProduct(String name) { this.name = name; }

    @Override
    public void deliverGroceryItem(String name) {
        System.out.println("Delivering grocery product: " + name);
    }
}
