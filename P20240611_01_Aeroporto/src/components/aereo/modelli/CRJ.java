package components.aereo.modelli;

import components.aereo.Aereo;

//medio bassa portata
public class CRJ extends Aereo {

    private final static int POST_MCF = 230;
    public CRJ() {
        super(POST_MCF);
        this.pDisp = POST_MCF;
    }
}
