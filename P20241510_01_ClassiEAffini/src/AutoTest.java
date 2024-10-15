import java.util.Arrays;

public class AutoTest {

    public static void main(String[] args) {
        Autoveicolo[] array = creaVeicoli("peppino","ciao","no","paperino","pippo");
        forClassic(array);
        forEnhanced(array);
        forEachStream(array);
    }

    //input 5 stringhe return array 5 elemente con 5 oggetti autoveicolo

    public static Autoveicolo[] creaVeicoli(String a1, String a2, String a3, String a4, String a5) {
        return new Autoveicolo[]{
                new Autoveicolo(a1),
                new Autoveicolo(a2),
                new Autoveicolo(a3),
                new Autoveicolo(a4),
                new Autoveicolo(a5)};
    }

    public static void stampaCont(Autoveicolo[] ar) {

    }
    private static void forClassic(Autoveicolo[] a){
        System.out.println("ForClassic: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].nome);
        }
    }
    // for x in array:
    private static void forEnhanced(Autoveicolo[] a) {
        System.out.println("\nForEnhanced: ");
        for (Autoveicolo x : a) {
            System.out.println(x.nome);
        }
    }
    private static void forEachStream(Autoveicolo[] a) {
        System.out.println("\nforEachStream: ");
        Arrays.stream(a).forEach(autoveicolo -> {
            var nome = autoveicolo.nome;
            if (nome.length() > 5) {
                System.out.println(nome);
            }
        });
    }
}
