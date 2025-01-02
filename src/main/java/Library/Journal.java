/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author Pongo
 */
public class Journal implements Lendable {
    private String title;
    private String volume;
    private String issue;
    private boolean isLent;

    public Journal(String title, String author, String volume) {
        this.title = title;
        this.volume = volume;
        this.issue = issue;
        this.isLent = false;
    }
    @Override
    public void lend() {
        if (isLent) {
            System.out.println("DVD is already lent out.");
        } else {
            isLent = true;
            System.out.println("DVD lent successfully.");
        }
    }

    @Override
    public void returnItem() {
        if (!isLent) {
            System.out.println("DVD is not currently lent out.");
        } else {
            isLent = false;
            System.out.println("DVD returned successfully.");
        }
    }

    @Override
    public String toString() {
        return "Journal: " + getTitle() + ", Volume: " + volume + ", Issue: " + issue;
    }

    @Override
    public String getTitle() {
        return this.title; // Sesuaikan dengan atribut yang menyimpan judul di kelas tersebut
    }

    @Override
    public Iterable<Review> getReviews() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}