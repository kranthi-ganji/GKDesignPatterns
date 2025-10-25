package org.adapter;

public class FoodItem implements Item{
    private String name;

    public FoodItem(String name) { this.name = name; }

    @Override
    public void deliver(String ignored) {
        System.out.println("Delivering food item: " + name);
    }
}
