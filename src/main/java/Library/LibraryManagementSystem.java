/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class LibraryManagementSystem {
    private List<Lendable> items;
    private List<Patron> patrons;
    private Scanner scanner;

    public LibraryManagementSystem() {
        items = new ArrayList<>();
        patrons = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Login as Borrower");
            System.out.println("2. Login as Staff");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    borrowerMenu();
                    break;
                case 2:
                    staffMenu();
                    break;
                case 3:
                    System.out.println("Exiting system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void borrowerMenu() {
        while (true) {
            System.out.println("Borrower Menu");
            System.out.println("1. List Items");
            System.out.println("2. Lend Item");
            System.out.println("3. Return Item");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    listItems();
                    break;
                case 2:
                    lendItem();
                    break;
                case 3:
                    returnItem();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void staffMenu() {
        while (true) {
            System.out.println("Staff Menu");
            System.out.println("1. Add Item");
            System.out.println("2. List Items");
            System.out.println("3. Find Item");
            System.out.println("4. Update Item");
            System.out.println("5. Remove Item");
            System.out.println("6. Register Patron");
            System.out.println("7. List Patrons");
            System.out.println("8. Find Patron");
            System.out.println("9. Remove Patron");
            System.out.println("10. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    listItems();
                    break;
                case 3:
                    findItem();
                    break;
                case 4:
                    updateItem();
                    break;
                case 5:
                    removeItem();
                    break;
                case 6:
                    registerPatron();
                    break;
                case 7:
                    listPatrons();
                    break;
                case 8:
                    findPatron();
                    break;
                case 9:
                    removePatron();
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void addItem() {
        System.out.println("Add Item");
        System.out.println("1. Book");
        System.out.println("2. DVD");
        System.out.println("3. Magazine");
        System.out.println("4. Journal");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter book title: ");
                String bookTitle = scanner.nextLine();
                System.out.print("Enter author: ");
                String author = scanner.nextLine();
                System.out.print("Enter ISBN: ");
                String isbn = scanner.nextLine();
                items.add(new Book(bookTitle, author, isbn));
                System.out.println("Book added successfully.");
                break;
            case 2:
                System.out.print("Enter DVD title: ");
                String dvdTitle = scanner.nextLine();
                System.out.print("Enter director: ");
                String director = scanner.nextLine();
                items.add(new DVD(dvdTitle, director));
                System.out.println("DVD added successfully.");
                break;
            case 3:
                System.out.print("Enter magazine title: ");
                String magazineTitle = scanner.nextLine();
                System.out.print("Enter issue: ");
                String issue = scanner.nextLine();
                items.add(new Magazine(magazineTitle, issue));
                System.out.println("Magazine added successfully.");
                break;
            case 4:  // Menambahkan opsi Journal
                System.out.print("Enter journal title: ");
                String journalTitle = scanner.nextLine();
                System.out.print("Enter journal volume: ");
                String volume = scanner.nextLine();
                System.out.print("Enter journal issue: ");
                String issueJournal = scanner.nextLine();
                items.add(new Journal(journalTitle, volume, issueJournal));
                System.out.println("Journal added successfully.");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    private void listItems() {
        if (items.isEmpty()) {
            System.out.println("No items in the library.");
        } else {
            for (Lendable item : items) {
                System.out.println(item);
            }
        }
    }

    private void lendItem() {
        System.out.print("Enter item title to lend: ");
        String title = scanner.nextLine();
        for (Lendable item : items) {
            if (item.toString().contains(title)) {
                item.lend();
                return;
            }
        }
        System.out.println("Item not found.");
    }

    private void returnItem() {
        System.out.print("Enter item title to return: ");
        String title = scanner.nextLine();
        for (Lendable item : items) {
            if (item.toString().contains(title)) {
                item.returnItem();
                return;
            }
        }
        System.out.println("Item not found.");
    }

    private void findItem() {
        System.out.print("Enter item title to find: ");
        String title = scanner.nextLine();
        for (Lendable item : items) {
            if (item.toString().contains(title)) {
                System.out.println(item);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    private void updateItem() {
        System.out.print("Enter item title to update: ");
        String title = scanner.nextLine();
        for (Lendable item : items) {
            if (item.toString().contains(title)) {
                System.out.println("Update not implemented.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    private void removeItem() {
        System.out.print("Enter item title to remove: ");
        String title = scanner.nextLine();
        items.removeIf(item -> item.toString().contains(title));
        System.out.println("Item removed if it existed.");
    }

    private void registerPatron() {
        System.out.print("Enter patron name: ");
        String name = scanner.nextLine();
        System.out.print("Enter patron ID: ");
        String id = scanner.nextLine();
        patrons.add(new Patron(name, id));
        System.out.println("Patron registered successfully.");
    }

    private void listPatrons() {
        if (patrons.isEmpty()) {
            System.out.println("No patrons registered.");
        } else {
            for (Patron patron : patrons) {
                System.out.println(patron);
            }
        }
    }

    private void findPatron() {
        System.out.print("Enter patron ID to find: ");
        String id = scanner.nextLine();
        for (Patron patron : patrons) {
            if (patron.toString().contains(id)) {
                System.out.println(patron);
                return;
            }
        }
        System.out.println("Patron not found.");
    }

    private void removePatron() {
        System.out.print("Enter patron ID to remove: ");
        String id = scanner.nextLine();
        patrons.removeIf(patron -> patron.toString().contains(id));
        System.out.println("Patron removed if they existed.");
    }

    public static void main(String[] args) {
        new LibraryManagementSystem().start();
    }
}
