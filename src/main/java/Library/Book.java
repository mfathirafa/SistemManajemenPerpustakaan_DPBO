package Library;

public class Book implements Lendable {
    private String title;
    private String author;
    private String isbn;
    private boolean isLent;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isLent = false;
    }

    @Override
    public void lend() {
        if (isLent) {
            System.out.println("Book is already lent out.");
        } else {
            isLent = true;
            System.out.println("Book lent successfully.");
        }
    }

    @Override
    public void returnItem() {
        if (!isLent) {
            System.out.println("Book is not currently lent out.");
        } else {
            isLent = false;
            System.out.println("Book returned successfully.");
        }
    }

    @Override
    public String toString() {
        return "Book: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}