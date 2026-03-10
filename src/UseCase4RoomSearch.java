/**
 * ---------------------------------------------------------------
 * MAIN CLASS – UseCase4RoomSearch
 * ---------------------------------------------------------------
 *
 * Use Case 4: Room Search & Availability Check
 *
 * Demonstrates safe read-only access to inventory.
 *
 * @author Developer
 * @version 4.1
 */

public class UseCase4RoomSearch {

    public static void main(String[] args) {

        System.out.println("=== Book My Stay ===");
        System.out.println("Hotel Booking Management System");
        System.out.println("Version 4.1\n");

        RoomInventory inventory = new RoomInventory();

        RoomSearchService searchService = new RoomSearchService(inventory);

        searchService.displayAvailableRooms();
    }
}