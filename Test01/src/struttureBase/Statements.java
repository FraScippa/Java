package struttureBase;

public class Statements {

    static int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) { //punto di accesso della classe

        //Forma forma = new Rettagolo();
        //switchStatement(forma);
        forLoop();
        ifStatement();
        whileLoop();
    }


    /* public static void switchStatement(Forma forma) {

        //Pattern Matching
        switch (forma) {
            case Rettagolo rettagolo:
                rettagolo.describe();
                break;
            case Quadrato quadrato:
                quadrato.describe();
                break;
            case Triangolo triangolo:
                triangolo.describe();
                break;
            default:
                System.out.println("La forma non è supportata");
        }

    } */


    public static void whileLoop() {

        boolean found = false;

        while (!found) {
            for (int number : numbers2) {
                if (number == 5) {
                    found = true;
                    break;
                }
            }
        }

        int j = 1;
        do {
            System.out.println("Counter(do-while): " + j);
            j++;
        } while (j < 1);
    }

    public static void forLoop() {

        for (int i = 1; i < 11; i++) {
            System.out.println("Counter: " + i);
        }
    }


    public static void ifStatement() {

        for (int number : numbers2) {

            if (number % 2 == 0 && number % 3 == 0) {
                System.out.println(number + " is even.");
            } else if(number % 2 == 0) {
                System.out.println(number + " is odd.");
            } else {
                System.out.println(number + " is odd.");
            }
        }

    }

    public static String ternaryOp(){

        int x = 5;

        return x > 0 ? "True" : "False"; //Operatore ternario, è un If = [condizione ? (cosa fa se la condizione è vera) : (cosa fa se la condizione è falsa)]
    }
}
