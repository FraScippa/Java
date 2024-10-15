package mestieri;

import implementazione.Persona;

public class Infermiere extends Persona {
    private int id;
    public Infermiere(String s1, String s2, Integer i1) {
        super(s1, s2);
        this.id = i1;
    }
}
