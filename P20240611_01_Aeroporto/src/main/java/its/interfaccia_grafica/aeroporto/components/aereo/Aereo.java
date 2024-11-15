package its.interfaccia_grafica.aeroporto.components.aereo;

import its.interfaccia_grafica.aeroporto.components.Persona;

import java.util.ArrayList;
import java.util.List;

public abstract class Aereo {
    private static final String baseVersion = "A";
    private static int instanceID = 1;
    private final int effID;
    protected int pDisp;
    protected ArrayList<Persona> passeggeri;

    public Aereo() {
        this.effID = instanceID;
        this.passeggeri = new ArrayList<>();
        instanceID ++;
    }

    public String getEffID() {
        return baseVersion + effID;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (" + getEffID() + ")";
    }
    public boolean addPasseggero(Persona passeggero){
        if (pDisp > 0) {
            pDisp--;
            return passeggeri.add(passeggero);
        }
        return false;
    }
    public boolean addPasseggeri(List<Persona> passeggeri){
        if (passeggeri.size() <= pDisp) {
            pDisp -= passeggeri.size();
            return this.passeggeri.addAll(passeggeri);
        }
        return false;
    }

    public int getPostiDisp() {
        return pDisp;
    }
}
