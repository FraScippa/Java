package components.aereo;

import components.Persona;

import java.util.ArrayList;

import static java.lang.StringTemplate.STR;

public abstract class Aereo {
    private static final String baseVersion = "A";
    private static int instanceID = 1;
    private final int effID;
    private final int postiMax;
    protected int pDisp;
    protected ArrayList<Persona> passeggeri;

    public Aereo(int postMCF) {
        this.postiMax = postMCF;
        this.effID = instanceID;
        instanceID ++;
    }

    public String getEffID() {
        return baseVersion + effID;
    }
    @Override
    public String toString() {
        return STR."Aereo: \{getEffID()}";
    }


    public int getPostiMax() {
        return postiMax;
    }
}
