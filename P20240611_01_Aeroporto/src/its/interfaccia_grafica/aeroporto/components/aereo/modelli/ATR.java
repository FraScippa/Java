package its.interfaccia_grafica.aeroporto.components.aereo.modelli;

import its.interfaccia_grafica.aeroporto.components.aereo.Aereo;

//Portata medio alta
public class ATR extends Aereo {
    private final static int POSTI_MAX = 320;
    public ATR() {
        super();
        this.pDisp = POSTI_MAX;
    }
}
