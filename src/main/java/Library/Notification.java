/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author Pongo
 */
public class Notification {
    private String notificationId;
    private String message;
    private Patron patron;

    public Notification(String notificationId, String message, Patron patron) {
        this.notificationId = notificationId;
        this.message = message;
        this.patron = patron;
    }

    public void sendNotification() {
        System.out.println("Notification sent to " + patron.getName() + ": " + message);
    }
}