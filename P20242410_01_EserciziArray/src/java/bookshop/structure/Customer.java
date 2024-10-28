package bookshop.structure;

import bookshop.utilites.checks.ValidityChecks;
import bookshop.utilites.exceptions.InvalidIdentityException;

import java.time.LocalDate;

public class Customer extends Person {
    private String email;
    private String codiceFiscale;
    private Book[] libriAcquistati;
    private Book[] libriInPrestito;


    public Customer(String name, String surname, LocalDate dob, String email, String codiceFiscale) throws InvalidIdentityException {
        super(name, surname, dob);
        if(!ValidityChecks.checkEmail(email)) {
            throw new InvalidIdentityException("Email non valida");
        }
        if(!ValidityChecks.checkCodiceFiscale(codiceFiscale)) {
            throw new InvalidIdentityException("Codice Fiscale non valido");
        }

        this.email = email;
        this.codiceFiscale = codiceFiscale;
        libriAcquistati = new Book[100];
        libriInPrestito = new Book[2];
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }
    public Book[] getLibriAcquistati() {
        return libriAcquistati;
    }

    public void setLibriAcquistati(Book[] libriAcquistati) {
        this.libriAcquistati = libriAcquistati;
    }

    public Book[] getLibriInPrestito() {
        return libriInPrestito;
    }

    public void setLibriInPrestito(Book[] libriInPrestito) {
        this.libriInPrestito = libriInPrestito;
    }
}
