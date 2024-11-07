package components.aereo.modelli;

import components.aereo.Aereo;

//grande
public class Airbus320 extends Aereo {
    private final static int POST_MCF = 475;
    public Airbus320() {
        super(POST_MCF);
        this.pDisp = POST_MCF;
    }
}
