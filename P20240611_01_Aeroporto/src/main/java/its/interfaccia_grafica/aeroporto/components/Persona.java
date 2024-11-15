package its.interfaccia_grafica.aeroporto.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona implements Serializable {

    private String nome;
    private String cognome;
    private String email;
    private Carta carta; //può essere nullo

    public Persona(String nome, String cognome, String email, String carta) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.carta = new Carta(carta);
    }

    @JsonCreator
    public Persona(@JsonProperty("nome") String nome, @JsonProperty("cognome") String cognome, @JsonProperty("email") String email,@JsonProperty ("carta") Carta carta) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.carta = carta;
    }


    @Override
    public String toString() {
        return nome + " " + cognome;
    }

    public record Carta(String codice, String cvv) {

        public Carta(String codice, String cvv) {
            this.codice = checkCodice(codice) ? codice : null;
            this.cvv = checkCvv(cvv) ? cvv : null;
        }
        public Carta(String codice) {
            this(checkCodice(codice) ? codice : null, "000");
        }
        //ogg.toString()
        @Override
        public String toString() {
            return codice != null && cvv != null ? "Carta convalidata correttamente" : "Carta non valida";
        }
        private static boolean checkCodice(String codice) {
            final String codiceRegex = "^\\d{4} \\d{4} \\d{4} \\d{4}$";
            Pattern pattern = Pattern.compile(codiceRegex);
            Matcher matcher = pattern.matcher(codice);
            return matcher.matches();
        }

        private static boolean checkCvv(String cvv) {
            final String cvvRegex = "^\\d{3}$";
            Pattern pattern = Pattern.compile(cvvRegex);
            Matcher matcher = pattern.matcher(cvv);
            return matcher.matches();
        }
    }
}
