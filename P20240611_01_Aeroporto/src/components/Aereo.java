package components;

import java.util.ArrayList;

import static java.lang.StringTemplate.STR;

public class Aereo {
    private static final String baseVersion = "A";
    private static int instanceID = 1;
    private final int effID;
    private final ArrayList<Boolean> nPosti;
    private final int postiMax;

    public String getEffID() {
        return baseVersion + effID;
    }
    @Override
    public String toString() {
        return STR."Aereo: \{getEffID()}";
    }
    public Aereo(int postiMax) {
        this.postiMax = postiMax;
        this.nPosti = new ArrayList<>();
        this.effID = instanceID;
        instanceID ++;
    }
    public ArrayList<Boolean> getnPosti() {
        return nPosti;
    }

    public int getPostiMax() {
        return postiMax;
    }
}
