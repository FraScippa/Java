package components;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {

    private String nome;
    private String cognome;
    private String email;

    public static void main(String[] args) {
        Carta c1= new Carta("0000 0000 0000 0000", "000");
        System.out.println(c1);
    }



    private record Carta(String codice, String cvv) {

        public Carta(String codice, String cvv) {
            this.codice = checkCodice(codice) ? codice : null;
            this.cvv = checkCvv(cvv) ? cvv : null;
        }

        @Override
        public String toString() {
            return codice != null && cvv != null ? "Carta convalidata correttamente" : "Carta non valida";
        }

        private boolean checkCodice(String codice) {
            final String codiceRegex = "^\\d{4} \\d{4} \\d{4} \\d{4}$";
            Pattern pattern = Pattern.compile(codiceRegex);
            Matcher matcher = pattern.matcher(codice);
            return matcher.matches();
        }

        private boolean checkCvv(String cvv) {
            final String cvvRegex = "^\\d{3}$";
            Pattern pattern = Pattern.compile(cvvRegex);
            Matcher matcher = pattern.matcher(cvv);
            return matcher.matches();
        }
    }
}
