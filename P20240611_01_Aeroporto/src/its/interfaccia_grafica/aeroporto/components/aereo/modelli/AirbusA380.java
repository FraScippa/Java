package its.interfaccia_grafica.aeroporto.components.aereo.modelli;

import its.interfaccia_grafica.aeroporto.components.aereo.Aereo;

//2 piani il più grande
public class AirbusA380 extends Aereo {

    private final static int POSTI_MAX = 529;
    public AirbusA380() {
        super();
        this.pDisp = POSTI_MAX;
    }
}
