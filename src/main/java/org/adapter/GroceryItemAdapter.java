package org.adapter;

public class GroceryItemAdapter implements Item
{
    private GroceryItem groceryItem;

    public GroceryItemAdapter(GroceryItem groceryItem) {
        this.groceryItem = groceryItem;
    }

    @Override
    public void deliver(String name) {
        groceryItem.deliverGroceryItem(name);  // Translate to GroceryItem method
    }
}
