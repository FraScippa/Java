package its.interfaccia_grafica.aeroporto.components;

public class Agenzia {
    private final Compagnia comp1;
    private final Compagnia comp2;

    public Agenzia(Compagnia comp1, Compagnia comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    public Compagnia getComp1() {
        return comp1;
    }

    public Compagnia getComp2() {
        return comp2;
    }
}
