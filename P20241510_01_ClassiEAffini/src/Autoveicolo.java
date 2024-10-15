public class Autoveicolo {
    private int cilindrata;
    private double consumo;
    private double serbatoio;
    private String colore;
    private double prezzo;
    private double velocitaMax;
    public String nome;

    public double calcoloKM(double n) {
        return (velocitaMax - (velocitaMax*0.4)) * n;
    }

    public Autoveicolo(String nome) {
        this.nome = nome;
    }

    public Autoveicolo(int cilindrata,
                       double consumo,
                       double serbatoio,
                       String colore,
                       double prezzo,
                       double velocitaMax) {
        this.cilindrata = cilindrata;
        this.consumo = consumo;
        this.serbatoio = serbatoio;
        this.colore = colore;
        this.prezzo = prezzo;
        this.velocitaMax = velocitaMax;
    }

    @Override
    public String toString() {
        return "Autoveicolo{" +
                "\n\tcilindrata=" + cilindrata +
                ", \n\tconsumo=" + consumo +
                ", \n\tserbatoio=" + serbatoio +
                ", \n\tcolore='" + colore + '\'' +
                ", \n\tprezzo=" + prezzo +
                ", \n\tvelocitaMax=" + velocitaMax +
                "}\n";
    }

    public double getVelocitaMax() {
        return velocitaMax;
    }

    public void setVelocitaMax(double velocitaMax) {
        this.velocitaMax = velocitaMax;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getSerbatoio() {
        return serbatoio;
    }

    public void setSerbatoio(double serbatoio) {
        this.serbatoio = serbatoio;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
