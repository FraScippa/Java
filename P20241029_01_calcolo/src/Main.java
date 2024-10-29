import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Scrivere un programma che interpreta stringhe che eseguono operazioni aritmetiche del tipo

    e, una volta letta la stringa di input,
    verifica se ci sono operatori o se è n solo operando
    se è un solo operando ne stampa il valore
    se c'è un operatore, separa i due operandi, esegue l'operazionie e stampa il risultato
    Una volta scritto questo programma pubblicarlo

    Successivamente scrivere un secondo programma che calcoli, senza tener conto della precedenza tra gli operatori, anche espressioni più complesse
    esempio
    4+5*2-1=19
    poiché 4+5=9
    9*2 =18
    18+1=19*/
        System.out.println("Inserire l'operazione: ");
        String stringa;

        try (Scanner scanner = new Scanner(System.in)){
            stringa = scanner.nextLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //per prima cosa tolgo tutti gli spazi bianchi
        stringa = stringa.replaceAll(" ", "");
        System.out.println(stringa);

        //poi provo a separare gli operandi (ci sarà una split?)
        String[] operandi = stringa.split("[\\+\\-\\/]");
        for (String s : operandi) {
            System.out.println(s);
        }

        //poi provo a estrarre l'operatore
        String[] voperatore = stringa.split("[0-9]+");
        for (String s : voperatore) {
            System.out.println("<" + s + ">");
        }

        //Quindi l'operatore sarà al secondo posto del vettore voperatori
        String operatore = voperatore[1];

        int o1 = Integer.parseInt(operandi[0]);
        int o2 = Integer.parseInt(operandi[1]);

        switch (operatore) {
            case "+" -> {
                int risultato = o1 + o2;
                System.out.println(risultato);
            }
            case "*" -> {
                int risultato = o1 * o2;
                System.out.println(risultato);
            }
            case "-" -> {
                int risultato = o1 - o2;
                System.out.println(risultato);
            }
            case "/" -> {
                int risultato = o1 / o2;
                System.out.println(risultato);
            }
        }
    }

}

