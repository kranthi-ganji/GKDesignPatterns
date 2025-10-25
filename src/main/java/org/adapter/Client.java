package org.adapter;

public class Client {
    public static void main(String[] args) {
        Swiggy swiggy = new Swiggy();
        swiggy.addItem(new FoodItem("Pizza"));
        swiggy.addItem(new GroceryItemAdapter(new GroceryProduct("Milk")));
        swiggy.deliverAll();
    }
}

