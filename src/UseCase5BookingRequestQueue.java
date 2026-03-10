/**
 * ---------------------------------------------------------------
 * MAIN CLASS – UseCase5BookingRequestQueue
 * ---------------------------------------------------------------
 *
 * Use Case 5: Booking Request Queue
 *
 * Demonstrates FIFO request handling for booking requests.
 *
 * @author Developer
 * @version 5.1
 */

public class UseCase5BookingRequestQueue {

    public static void main(String[] args) {

        System.out.println("=== Book My Stay ===");
        System.out.println("Hotel Booking Management System");
        System.out.println("Version 5.1\n");

        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        Reservation r1 = new Reservation("Alice", "Single Room");
        Reservation r2 = new Reservation("Bob", "Double Room");
        Reservation r3 = new Reservation("Charlie", "Suite Room");

        bookingQueue.addRequest(r1);
        bookingQueue.addRequest(r2);
        bookingQueue.addRequest(r3);

        bookingQueue.displayQueue();
    }
}