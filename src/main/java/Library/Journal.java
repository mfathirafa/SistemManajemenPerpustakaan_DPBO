/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author Pongo
 */
public class Journal extends LibraryItem {
    private String volume;
    private String issue;

    public Journal(String title, String author, int publicationYear, String volume, String issue) {
        super(title, author, publicationYear);
        this.volume = volume;
        this.issue = issue;
    }

    @Override
    public String getItemDetails() {
        return "Journal: " + getTitle() + ", Volume: " + volume + ", Issue: " + issue;
    }
}