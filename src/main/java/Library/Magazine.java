/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author Lenovo
 */
public class Magazine implements Lendable {
    private String title;
    private String issue;
    private boolean isLent;

    public Magazine(String title, String issue) {
        this.title = title;
        this.issue = issue;
        this.isLent = false;
    }

    @Override
    public void lend() {
        if (isLent) {
            System.out.println("Magazine is already lent out.");
        } else {
            isLent = true;
            System.out.println("Magazine lent successfully.");
        }
    }

    @Override
    public void returnItem() {
        if (!isLent) {
            System.out.println("Magazine is not currently lent out.");
        } else {
            isLent = false;
            System.out.println("Magazine returned successfully.");
        }
    }

    @Override
    public String toString() {
        return "Magazine: " + title + ", Issue: " + issue;
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