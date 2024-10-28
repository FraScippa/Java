package bookshop;

import bookshop.structure.Author;
import bookshop.structure.Book;
import bookshop.utilites.exceptions.InvalidIdentityException;

import java.time.LocalDate;

public class Libreria {

    public static void main(String[] args) {

        try {
            Author a1 = new Author("Nicolò","Di Silvestro", LocalDate.of(1998,8,7));
            Book b1 = new Book("I promessi sposi", a1, 300, 90.0, LocalDate.of(1657, 5, 4));
            System.out.println(b1);
            System.out.println(a1);
        } catch (InvalidIdentityException e) {
            System.err.println(e.getMessage());
        }

    }
}
