import java.util.ArrayList;

public class Inventory {
    // declaring ArrayList of items/objects with items referring to this data struct, this makes items a variable referring to an object
    private ArrayList<Item> items;
    
    // constructor to assign a value of empty array list to items, hereby items transits from variable to an object
    public Inventory() {
        items = new ArrayList<>();
    }
    // adding items to the inventory
    public void addItem(Item item) {
        items.add(item);
    }

    public void displayInventory() {
        for (Item item : items) {
            System.out.println("Item: " + item.getName() + ", Quantity: " + item.getQuantity());
        }
        
    }
}
