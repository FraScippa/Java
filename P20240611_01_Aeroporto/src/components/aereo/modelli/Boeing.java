package components.aereo.modelli;

import components.aereo.Aereo;

//più usati al livello mondiale
public class Boeing extends Aereo {
    private final static int POST_MCF = 353;

    public Boeing() {
        super(POST_MCF);
        this.pDisp = POST_MCF;
    }

}
