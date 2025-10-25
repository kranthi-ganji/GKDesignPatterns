package org.adapter;

import java.util.ArrayList;
import java.util.List;

public class Swiggy {
    private List<Item> orderList = new ArrayList<>();

    // Add item (accepts only Item interface)
    public void addItem(Item item) {
        orderList.add(item);
    }

    // Deliver all items
    public void deliverAll() {
        for (Item item : orderList) {
            // Give actual item name
            if (item instanceof FoodItem) {
                item.deliver("Pizza"); // or real food name
            } else if (item instanceof GroceryItemAdapter) {
                item.deliver("Milk"); // or real grocery name
            }
        }
    }
}
