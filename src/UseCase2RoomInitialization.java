/**
 * ---------------------------------------------------------------
 * MAIN CLASS – UseCase2RoomInitialization
 * ---------------------------------------------------------------
 *
 * Use Case 2: Basic Room Types & Static Availability
 *
 * Demonstrates object modeling using inheritance
 * and abstraction for hotel rooms.
 *
 * @author Developer
 * @version 2.1
 */

public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        int singleAvailability = 10;
        int doubleAvailability = 6;
        int suiteAvailability = 2;

        System.out.println("=== Book My Stay ===");
        System.out.println("Hotel Booking Management System");
        System.out.println("Version 2.1\n");

        System.out.println("Available Room Types\n");

        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailability);
        System.out.println();

        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailability);
        System.out.println();

        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailability);
    }
}