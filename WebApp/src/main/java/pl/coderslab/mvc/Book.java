package pl.coderslab.mvc;

public class Book {
    private String bookTitle;
    private String authorName;
    private int isbn;


    public Book(String bookTitle, String authorName,int isbn) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.isbn = isbn;
    }
    public String getTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return authorName;
    }

    public int getIsbn() {
        return isbn;
    }
}
