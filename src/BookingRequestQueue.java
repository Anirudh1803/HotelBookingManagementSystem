import java.util.LinkedList;
import java.util.Queue;

/**
 * ---------------------------------------------------------------
 * CLASS – BookingRequestQueue
 * ---------------------------------------------------------------
 *
 * Stores booking requests in arrival order using a Queue.
 *
 * @author Developer
 * @version 5.0
 */

public class BookingRequestQueue {

    private Queue<Reservation> requestQueue;

    public BookingRequestQueue() {
        requestQueue = new LinkedList<>();
    }

    public void addRequest(Reservation reservation) {

        requestQueue.add(reservation);

        System.out.println("Booking request received:");
        reservation.displayReservation();
        System.out.println();
    }

    public void displayQueue() {

        System.out.println("=== Pending Booking Requests ===\n");

        for (Reservation reservation : requestQueue) {

            reservation.displayReservation();
            System.out.println();
        }
    }
}