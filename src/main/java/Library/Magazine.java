/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author Lenovo
 */
public class Magazine extends LibraryItem {
    private String description;

    public Magazine(String title, String author, int publicationYear, String description) {
        super(title, author, publicationYear);
        this.description = description;
    }

    @Override
    public String getItemDetails() {
        return "Magazine: " + getTitle() + ", Description: " + description;
    }
}