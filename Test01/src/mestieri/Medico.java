package mestieri;

import implementazione.Persona;

public class Medico extends Persona {
    private String specializzazione;
    public Medico(String s1, String s2, String s3) {
        super(s1, s2);
        this.specializzazione = s3;
    }
    @Override
    public void welcome(){
        System.out.println("Welcome, I am " + super.getNome() + " " + super.getCognome() + " and my specialization is " + this.specializzazione);
    }
}

