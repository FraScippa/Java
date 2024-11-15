package its.interfaccia_grafica.aeroporto.components.aereo.modelli;

import its.interfaccia_grafica.aeroporto.components.aereo.Aereo;

//più usati al livello mondiale
public class Boeing extends Aereo {
    private final static int POSTI_MAX = 353;

    public Boeing() {
        super();
        this.pDisp = POSTI_MAX;
    }

}
