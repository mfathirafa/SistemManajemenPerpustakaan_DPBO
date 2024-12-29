/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author HP
 */
public class DVD extends LibraryItem {
    private String duration;

    public DVD(String title, String author, int publicationYear, String duration) {
        super(title, author, publicationYear);
        this.duration = duration;
    }

    @Override
    public String getItemDetails() {
        return "DVD: " + getTitle() + ", Duration: " + duration;
    }
}