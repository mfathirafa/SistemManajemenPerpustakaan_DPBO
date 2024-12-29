/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author Lenovo
 */
public class Staff {
    private String staffId;
    private String name;

    public Staff(String staffId, String name) {
        this.staffId = staffId;
        this.name = name;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItem(Library library, LibraryItem item) {
        library.addItem(item);
    }

    public void removeItem(Library library, String title) {
        library.removeItem(title);
    }
}