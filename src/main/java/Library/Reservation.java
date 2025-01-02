/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Reservation {
    private String reservationId;
    private Patron patron;
    private LibraryItem item;
    private Date reservationDate;

    public Reservation(String reservationId, Patron patron, LibraryItem item, Date reservationDate) {
        this.reservationId = reservationId;
        this.patron = patron;
        this.item = item;
        this.reservationDate = reservationDate;
    }

    public String getReservationDetails() {
        return "Reservation[ID=" + reservationId + ", Patron=" + patron.getName() + ", Item=" + item.getTitle() + "]";
    }
}
