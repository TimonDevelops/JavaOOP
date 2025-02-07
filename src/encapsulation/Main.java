public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Item item1 = new Item("Ball", 5);
        Item item2 = new Item("Stick", 4);
        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.displayInventory();
    }
}

