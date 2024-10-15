package implementazione;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public abstract class Animal {
    private String nome;
    private String razza;
    private LocalDate dataDiNascita;

    public Animal(String s1, String s2, LocalDate d1){
        this.nome = s1;
        this.razza = s2;
        this.dataDiNascita = d1;
    }
    public abstract void makeSound();
    public void describe(){
        System.out.printf("Hello! My name is %s, my race is %s, and my bday is %s", this.nome, this.razza, this.dataDiNascita.toString());
    }
    public int calculationAge(){
        return (int) ChronoUnit.YEARS.between(this.dataDiNascita, LocalDate.now());
    }


}
