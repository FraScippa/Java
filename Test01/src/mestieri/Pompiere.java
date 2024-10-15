package mestieri;

import implementazione.Persona;

public class Pompiere extends Persona {
    private String stazione;
    public Pompiere(String s1, String s2, String s3) {
        super(s1, s2);
        this.stazione = s3;
    }
}
