package bookshop.structure;

import bookshop.utilites.exceptions.InvalidIdentityException;

import java.time.LocalDate;

public class Author extends Person {

    public Author(String name, String surname, LocalDate dob) throws InvalidIdentityException {
        super(name, surname, dob);
    }

    public String asString(boolean fullSize) {
        if (fullSize) {
            return toString();
        } return noDate();
    }
    private String noDate() {
        return "Author{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() +
                '}';
    }
    @Override
    public String toString() {
        return "Author{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", dob=" + getDob() +
                '}';
    }
}
