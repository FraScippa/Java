package its.interfaccia_grafica.aeroporto.components.aereo.modelli;

import its.interfaccia_grafica.aeroporto.components.aereo.Aereo;

//medio bassa portata
public class CRJ extends Aereo {
    private final static int POSTI_MAX = 230;
    public CRJ() {
        super();
        this.pDisp = POSTI_MAX;
    }
}
