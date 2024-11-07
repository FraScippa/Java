package components.aereo.modelli;

import components.aereo.Aereo;

//2 piani il più grande
public class AirbusA380 extends Aereo {

    private final static int POST_MCF = 529;
    public AirbusA380() {
        super(POST_MCF);
        this.pDisp = POST_MCF;
    }
}
