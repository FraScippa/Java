package components.aereo.modelli;

import components.aereo.Aereo;

//Portata medio alta
public class ATR extends Aereo {
    private final static int POST_MCF = 320;
    public ATR() {
        super(POST_MCF);
        this.pDisp = POST_MCF;
    }
}
