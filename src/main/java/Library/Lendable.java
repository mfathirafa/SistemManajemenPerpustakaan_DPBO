/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author ASUS
 */
public interface Lendable {
    void lend();
    void returnItem();

    public String getTitle();

    public Iterable<Review> getReviews();
}