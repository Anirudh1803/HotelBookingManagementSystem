/**
 * ---------------------------------------------------------------
 * MAIN CLASS – UseCase3InventorySetup
 * ---------------------------------------------------------------
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Demonstrates how a HashMap can manage room availability
 * using a single source of truth.
 *
 * @author Developer
 * @version 3.1
 */

public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("=== Book My Stay ===");
        System.out.println("Hotel Booking Management System");
        System.out.println("Version 3.1\n");

        RoomInventory inventory = new RoomInventory();

        inventory.displayInventory();

        System.out.println("\nChecking availability of Double Room:");
        System.out.println("Available: " + inventory.getAvailability("Double Room"));

        System.out.println("\nUpdating availability of Double Room to 5...\n");

        inventory.updateAvailability("Double Room", 5);

        inventory.displayInventory();
    }
}