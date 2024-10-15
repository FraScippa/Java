package struttureBase;

import java.util.Scanner;

public class StatementsEx {

    public static void main(String[] args) { //per inserire da console

        //System.out.println(checkNumb());
        //System.out.println(checkYear()); //ctrl + D duplichi la riga
        try {
            System.out.println(checkScore());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static String checkNumb(){ //se c'è solo 1 riga di istruzioni puoi togliere le {} e metterli sulla stessa riga.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number < 0) return "Il numero è minore di 0";

        else if (number > 0) return "Il numero è maggiore di 0";

        else return "Il numero è 0";
    }

    public static String checkYear(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0) return "L'anno è bisestile";
        return "L'anno non è bisestile";
    }

    public static char checkScore() throws IllegalArgumentException { //90-100:A; 80-89:B; 70-79:C; 60-69:D; <60:F;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a score: ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) throw new IllegalArgumentException("Invalid score."); //prima controlla se non sono diversi dalla richiesta e manda l'eccezione

        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        return 'F';
        }

}


