/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author Pongo
 */
public class Review {
    private String reviewId;
    private String comment;
    private int rating;
    private Patron patron;
    private LibraryItem item;

    public Review(String reviewId, String comment, int rating, Patron patron, LibraryItem item) {
        this.reviewId = reviewId;
        this.comment = comment;
        this.rating = rating;
        this.patron = patron;
        this.item = item;
    }

    public String getReviewDetails() {
        return "Review[ID=" + reviewId + ", Rating=" + rating + ", Comment=" + comment + "]";
    }
}