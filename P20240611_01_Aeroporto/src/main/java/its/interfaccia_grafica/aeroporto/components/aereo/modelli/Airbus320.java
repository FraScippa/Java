package its.interfaccia_grafica.aeroporto.components.aereo.modelli;

import its.interfaccia_grafica.aeroporto.components.aereo.Aereo;

//grande
public class Airbus320 extends Aereo {
    private final static int POSTI_MAX = 475;
    public Airbus320() {
        super();
        this.pDisp = POSTI_MAX;
    }
}
