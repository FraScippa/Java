package implementazione;

public abstract class Persona {
    //state: stato di un oggetto. Valori che incapsula l'oggetto.
    private String nome;
    private String cognome;

    //costruzione del costruttore (__init__)
    public Persona(String s1, String s2) {
        this.nome = s1;
        this.cognome = s2;
    }
    //void: tipo primitivo, utilizzato solo nei ritorni dei metodi. (quando,per esempio, c'è un "print", quindi non ci sarà un ritorno)
    public void welcome(){
        System.out.println("Welcome, I am " + this.nome + " " + this.cognome);
        System.out.printf("Welcome, My name is %s and my surname is %s", this.nome, this.cognome);
    }
    public String getNome(){
        return this.nome;
    }
    public String getCognome(){
        return this.cognome;
    }
}
