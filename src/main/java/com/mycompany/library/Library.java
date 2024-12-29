public class Library {
    private List<LibraryItem> items;
    private List<Patron> patrons;

    public Library() {
        this.items = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Create
    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println(item.getTitle() + " has been added to the library.");
    }

    public void registerPatron(Patron patron) {
        patrons.add(patron);
        System.out.println(patron.getName() + " has been registered as a patron.");
    }

    // Read
    public LibraryItem findItemByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    public Patron findPatronById(String patronId) {
        for (Patron patron : patrons) {
            if (patron.getPatronId().equalsIgnoreCase(patronId)) {
                return patron;
            }
        }
        return null;
    }

    public void listItems() {
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
        }
    }

    public void listPatrons() {
        for (Patron patron : patrons) {
            System.out.println(patron);
        }
    }

    // Update
    public void updateItem(String title, LibraryItem updatedItem) {
        LibraryItem item = findItemByTitle(title);
        if (item != null) {
            items.remove(item);
            items.add(updatedItem);
            System.out.println(title + " has been updated.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public void updatePatron(String patronId, Patron updatedPatron) {
        Patron patron = findPatronById(patronId);
        if (patron != null) {
            patrons.remove(patron);
            patrons.add(updatedPatron);
            System.out.println("Patron " + patronId + " has been updated.");
        } else {
            System.out.println("Patron not found.");
        }
    }

    // Delete
    public void removeItem(String title) {
        LibraryItem item = findItemByTitle(title);
        if (item != null) {
            items.remove(item);
            System.out.println(title + " has been removed from the library.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public void removePatron(String patronId) {
        Patron patron = findPatronById(patronId);
        if (patron != null) {
            patrons.remove(patron);
            System.out.println("Patron " + patronId + " has been removed.");
        } else {
            System.out.println("Patron not found.");
        }
    }
}