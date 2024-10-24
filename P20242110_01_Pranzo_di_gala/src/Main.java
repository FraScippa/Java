public class Main {
    public static void main(String[] args) {
        //calcolaCalorie();
        pranzoDiGala(invitati);
    }
    //Difficoltà:
    //Il pranzo di 50 persone è un array di pranzi dove ogni singolo pranzo contiene tre portate. Come fare?
    /*Altro esempio
    *Supponiamo che menu sia composto da (elenco solo i
       *nomi delle pietanze, senza indicare calorie o quant'altro,
       *per semplicità di lettura dell'esempio stesso
       *	[pasta e ceci, lombata, sogliola, pesce persico, delizia al limone, carciofi, pasta al forno, creme brulee, carbonara]
       *Io intendo realizzare un pranzo per 50 persone del tipo
       *persona1		persona2		persona3 ...
       *pasta e ceci	pasta al forno	carbonara
       *sogliola		sogliola		lombata
       *creme brulee	del al limone	carciofi */
    static void pranzoDiGala(String[] invitati) {
        Pietanza[][] pietanze = menu.getPietanze();
        for (String x : invitati) {
            Pietanza[] portate = new Pietanza[4];
            for (int i = 0; i < portate.length; i++) {
                portate[i] = pietanze[i][(int) (Math.random() * pietanze[i].length)];
            }
            System.out.println("Ospite: " + x);
            System.out.println("\tPrimo: " + portate[0]);
            System.out.println("\tSecondo: " + portate[1]);
            System.out.println("\tContorno: " + portate[2]);
            System.out.println("\tDolce: " + portate[3]);
            System.out.println();
        }

    }

    //1) Calcolare il numero totale di calorie assunte con questo menu
    //2) Costruire a partire da questo menu un pranzo per 50 persone,
    //dove ogni portata è composta da tre cibi presi a caso da questo menu.
    static void calcolaCalorie(){
        double somma = 0;
        Pietanza[][] pietanze = menu.getPietanze();
        String[] nomi = new String[4];

        for (int i = 0; i < pietanze.length; i++){
            Pietanza a = pietanze[i][(int) (Math.random() * pietanze[i].length)];
            somma += a.getCalorie();
            nomi[i] = a.getNome();
        }
        System.out.printf("Piatti ordinati: %s, %s, %s e %s\n", nomi[0], nomi[1], nomi[2], nomi[3]);
        System.out.println("Calorie totali: "+ somma);
    }

    static Menu menu = new Menu();
    static String[] invitati = {
            "Luca", "Giulia", "Matteo", "Sofia", "Leonardo",
            "Martina", "Alessandro", "Chiara", "Giorgio", "Francesca",
            "Nicola", "Sara", "Andrea", "Elena", "Roberto",
            "Alice", "Davide", "Giovanna", "Marco", "Valentina",
            "Simone", "Martina", "Tommaso", "Angela", "Filippo",
            "Beatrice", "Enrico", "Silvia", "Alessia", "Antonio",
            "Marta", "Giuseppe", "Laura", "Fabio", "Claudia",
            "Pietro", "Caterina", "Riccardo", "Isabella", "Domenico",
            "Ginevra", "Raffaele", "Teresa", "Matilda", "Vittorio",
            "Emanuele", "Arianna", "Carlo", "Sabrina", "Grazia"
    };


}