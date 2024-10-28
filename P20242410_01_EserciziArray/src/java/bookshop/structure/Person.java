package bookshop.structure;

import bookshop.utilites.checks.ValidityChecks;
import bookshop.utilites.exceptions.InvalidAgeException;
import bookshop.utilites.exceptions.InvalidIdentityException;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private String surname;
    private LocalDate dob;

    public Person(String name, String surname, LocalDate dob) throws InvalidIdentityException {
        if(name == null || surname == null || dob == null) {
            throw new InvalidIdentityException("Inserire i dati dell'autore in modo corretto, grazie");
        }
        if(!ValidityChecks.checkDob(dob)){
            throw new InvalidAgeException("Età non valida");
        }
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
