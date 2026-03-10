import java.util.HashMap;
import java.util.Map;

/**
 * ---------------------------------------------------------------
 * CLASS – RoomInventory
 * ---------------------------------------------------------------
 *
 * Manages centralized availability of hotel rooms.
 * Uses HashMap to store room type -> available count.
 *
 * @author Developer
 * @version 3.0
 */

public class RoomInventory {

    private Map<String, Integer> inventory;

    public RoomInventory() {

        inventory = new HashMap<>();

        inventory.put("Single Room", 10);
        inventory.put("Double Room", 6);
        inventory.put("Suite Room", 2);
    }

    public int getAvailability(String roomType) {

        return inventory.getOrDefault(roomType, 0);
    }

    public void updateAvailability(String roomType, int newCount) {

        inventory.put(roomType, newCount);
    }

    public void displayInventory() {

        System.out.println("=== Current Room Inventory ===");

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {

            System.out.println(entry.getKey() + " Available: " + entry.getValue());
        }
    }
}