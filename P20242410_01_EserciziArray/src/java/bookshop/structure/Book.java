package bookshop.structure;

import bookshop.utilites.exceptions.InvalidIdentityException;

import java.time.LocalDate;

public class Book {
    private final String title;
    private final Author author;
    private final int pages;
    private double price;
    private final LocalDate edition;

    public Book(String title, Author author, int pages, double price, LocalDate edition) throws InvalidIdentityException {
        if(title == null || author == null || pages <= 0 || price < 0 || edition == null) {
            throw new InvalidIdentityException("Inserire i dati del libro in modo corretto, grazie");
        }
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.edition = edition;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public LocalDate getEdition() {
        return edition;
    }
}
