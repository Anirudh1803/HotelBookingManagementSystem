/**
 * ---------------------------------------------------------------
 * CLASS – RoomSearchService
 * ---------------------------------------------------------------
 *
 * Provides read-only access to room availability and room details.
 * Ensures that searching does not modify system state.
 *
 * @author Developer
 * @version 4.0
 */

public class RoomSearchService {

    private RoomInventory inventory;

    public RoomSearchService(RoomInventory inventory) {
        this.inventory = inventory;
    }

    public void displayAvailableRooms() {

        System.out.println("=== Available Rooms ===\n");

        Room[] rooms = {
                new SingleRoom(),
                new DoubleRoom(),
                new SuiteRoom()
        };

        for (Room room : rooms) {

            int availability = inventory.getAvailability(room.roomType);

            if (availability > 0) {

                room.displayRoomDetails();
                System.out.println("Available: " + availability);
                System.out.println();
            }
        }
    }
}