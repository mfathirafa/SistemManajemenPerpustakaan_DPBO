/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author HP
 */
public class DVD implements Lendable {
    private String title;
    private String director;
    private boolean isLent;

    public DVD(String title, String director) {
        this.title = title;
        this.director = director;
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
        return "DVD: " + title + ", Director: " + director;
    }
}