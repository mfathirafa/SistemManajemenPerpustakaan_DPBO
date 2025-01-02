/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Item");
            System.out.println("2. List Items");
            System.out.println("3. Find Item");
            System.out.println("4. Update Item");
            System.out.println("5. Remove Item");
            System.out.println("6. Register Patron");
            System.out.println("7. List Patrons");
            System.out.println("8. Find Patron");
            System.out.println("9. Remove Patron");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add Item
                    System.out.print("Enter item type (Book/DVD/Journal/Magazine): ");
                    String itemType = scanner.nextLine();
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    LibraryItem item = null;
                    if (itemType.equalsIgnoreCase("Book")) {
                        System.out.print("Enter ISBN: ");
                        String isbn = scanner.nextLine();
                        System.out.print("Enter copies available: ");
                        int copies = scanner.nextInt();
                        item = new Book(title, author, year, isbn, copies);
                    } else if (itemType.equalsIgnoreCase("DVD")) {
                        System.out.print("Enter duration: ");
                        String duration = scanner.nextLine();
                        item = new DVD(title, author, year, duration);
                    } else if (itemType.equalsIgnoreCase("Journal")) {
                        System.out.print("Enter volume: ");
                        String volume = scanner.nextLine();
                        System.out.print("Enter issue: ");
                        String issue = scanner.nextLine();
                        item = new Journal(title, author, year, volume, issue);
                    } else if (itemType.equalsIgnoreCase("Magazine")) {
                        System.out.print("Enter description: ");
                        String description = scanner.nextLine();
                        item = new Magazine(title, author, year, description);
                    }

                    if (item != null) {
                        library.addItem(item);
                        System.out.println("Item added successfully.");
                    } else {
                        System.out.println("Invalid item type.");
                    }
                    break;

                case 2: // List Items
                    library.listItems();
                    break;

                case 3: // Find Item
                    System.out.print("Enter item title: ");
                    String searchTitle = scanner.nextLine();
                    LibraryItem foundItem = library.findItemByTitle(searchTitle);
                    if (foundItem != null) {
                        System.out.println("Found: " + foundItem.getItemDetails());
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 4: // Update Item
                    System.out.print("Enter item title to update: ");
                    String updateTitle = scanner.nextLine();
                    System.out.print("Enter new item type (Book/DVD/Journal/Magazine): ");
                    String newItemType = scanner.nextLine();
                    System.out.print("Enter new title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new author: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Enter new publication year: ");
                    int newYear = scanner.nextInt();
                    scanner.nextLine();

                    LibraryItem updatedItem = null;
                    if (newItemType.equalsIgnoreCase("Book")) {
                        System.out.print("Enter new ISBN: ");
                        String newIsbn = scanner.nextLine();
                        System.out.print("Enter new copies available: ");
                        int newCopies = scanner.nextInt();
                        updatedItem = new Book(newTitle, newAuthor, newYear, newIsbn, newCopies);
                    } else if (newItemType.equalsIgnoreCase("DVD")) {
                        System.out.print("Enter new duration: ");
                        String newDuration = scanner.nextLine();
                        updatedItem = new DVD(newTitle, newAuthor, newYear, newDuration);
                    } else if (newItemType.equalsIgnoreCase("Journal")) {
                        System.out.print("Enter new volume: ");
                        String newVolume = scanner.nextLine();
                        System.out.print("Enter new issue: ");
                        String newIssue = scanner.nextLine();
                        updatedItem = new Journal(newTitle, newAuthor, newYear, newVolume, newIssue);
                    } else if (newItemType.equalsIgnoreCase("Magazine")) {
                        System.out.print("Enter new description: ");
                        String newDescription = scanner.nextLine();
                        updatedItem = new Magazine(newTitle, newAuthor, newYear, newDescription);
                    }

                    if (updatedItem != null) {
                        library.updateItem(updateTitle, updatedItem);
                    } else {
                        System.out.println("Invalid item type.");
                    }
                    break;

                case 5: // Remove Item
                    System.out.print("Enter item title to remove: ");
                    String removeTitle = scanner.nextLine();
                    library.removeItem(removeTitle);
                    break;

                case 6: // Register Patron
                    System.out.print("Enter patron ID: ");
                    String patronId = scanner.nextLine();
                    System.out.print("Enter patron name: ");
                    String patronName = scanner.nextLine();
                    Patron newPatron = new Patron(patronId, patronName);
                    library.registerPatron(newPatron);
                    System.out.println("Patron registered successfully.");
                    break;

                case 7: // List Patrons
                    library.listPatrons();
                    break;

                case 8: // Find Patron
                    System.out.print("Enter patron ID: ");
                    String searchPatronId = scanner.nextLine();
                    Patron foundPatron = library.findPatronById(searchPatronId);
                    if (foundPatron != null) {
                        System.out.println("Found: " + foundPatron.getName());
                    } else {
                        System.out.println("Patron not found.");
                    }
                    break;

                case 9: // Remove Patron
                    System.out.print("Enter patron ID to remove: ");
                    String removePatronId = scanner.nextLine();
                    library.removePatron(removePatronId);
                    break;

                case 10: // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}