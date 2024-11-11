package its.interfaccia_grafica.aeroporto.components;

import its.interfaccia_grafica.aeroporto.components.aereo.Aereo;

import java.util.ArrayList;
import java.util.List;

public class Compagnia {
    private List<Aereo> aerei;
    private boolean enablePrint;
    public Compagnia(boolean enablePrint) {
        this.enablePrint = enablePrint;
        this.aerei = new ArrayList<>();
    }

    public List<Aereo> getAerei() {
        return aerei;
    }

    public Compagnia(List<Aereo> aerei, boolean enablePrint) {
        this.aerei = aerei;
        this.enablePrint = enablePrint;
    }

    public Compagnia(List<Aereo> aerei) {
        this.aerei = aerei;
        this.enablePrint = true;
    }
    public Compagnia() {
        this.enablePrint = true;
        this.aerei = new ArrayList<>();
    }

    public void setEnablePrint(boolean enablePrint) {
        this.enablePrint = enablePrint;
    }

    public void addAerei(final List<Aereo> l1) {
        l1.forEach(aereo -> addAereo(aereo)); //(this::addAereo) method references
        //lambda function(funzioni senza nome, non serve l'accessore.Chiamate come consumer)
    }

    public boolean addAereo(Aereo aereo){
        boolean added = aerei.add(aereo);
        if (enablePrint) {
            if (added) {
                System.out.println("l'aereo con ID: " + aereo.getEffID() + "è stato aggiunto con successo");
            } else {
                System.out.println("impossibile aggiungere l'aereo con ID: " + aereo.getEffID());
            }
        }
        return added;
    }
    public int numAerei(){
        return aerei.size();
        /*
        int n = 0;
        for (Aereo a : aerei) n++;
        return n;
        */
    }
    public void listAerei(){
        aerei.forEach(System.out::println);
    }

}
