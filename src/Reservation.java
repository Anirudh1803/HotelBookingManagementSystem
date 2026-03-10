/**
 * ---------------------------------------------------------------
 * CLASS – Reservation
 * ---------------------------------------------------------------
 *
 * Represents a guest's intent to book a room.
 *
 * @author Developer
 * @version 5.0
 */

public class Reservation {

    private String guestName;
    private String roomType;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void displayReservation() {

        System.out.println("Guest: " + guestName);
        System.out.println("Requested Room: " + roomType);
    }
}