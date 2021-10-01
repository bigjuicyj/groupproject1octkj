package controllers;

import modules.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemController {
    private static final List<Item> items = new ArrayList<>();

    public ItemController(){

    }

    public static List<Item> getItems() {
        return items;
    }

    public static String createItem(String itemID, String itemName, double price) {
        // Will check to see if the item ID is empty or the item name is empty or the price is <= 0
        if (itemID.isEmpty() || itemName.isEmpty() || price <= 0) {
            return "Invalid data for item.";
        } else {
            /* If that's all clear, loop through all the items in the arraylist to see if the item ID is the same
               as the ID you inputted into your method
            */
            for (Item item : items) {
                if (item.getItemID().equals(itemID)) {
                    return "Two items cannot have the same ID!";
                }
            }
        }
        // Otherwise, create a new item and add to the ItemController arraylist.
        Item item = new Item(itemID, itemName, price);
        items.add(item);
        return "Item " + itemID + " was registered successfully";
    }
}
