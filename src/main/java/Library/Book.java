package Library;

public class Book extends LibraryItem {
    private String isbn;
    private int copiesAvailable;

    public Book(String title, String author, int publicationYear, String isbn, int copiesAvailable) {
        super(title, author, publicationYear);
        this.isbn = isbn;
        this.copiesAvailable = copiesAvailable;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    @Override
    public String getItemDetails() {
        return "Book: " + getTitle() + ", Author: " + getAuthor() + ", ISBN: " + isbn;
    }
}
