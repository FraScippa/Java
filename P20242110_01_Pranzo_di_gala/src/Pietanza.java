public class Pietanza {

    private String nome;
    private double prezzo;
    private double calorie;

    public Pietanza(String nome, double prezzo, double calorie) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }

    @Override
    public String toString() {
        return nome + ", prezzo = " + prezzo +" €" + ", calorie = " + calorie + " kcal";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }
}
