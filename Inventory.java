import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Integer, Item> items = new HashMap<>();

    public void addItem(Item item) {
        items.put(item.getId(), item);
    }

    public void updateItem(Item item) {
        if (items.containsKey(item.getId())) {
            items.put(item.getId(), item);
        } else {
            System.out.println("Item not found.");
        }
    }

    public void removeItem(int id) {
        items.remove(id);
    }

    public void displayItems() {
        for (Item item : items.values()) {
            System.out.println(item);
        }
    }
}
