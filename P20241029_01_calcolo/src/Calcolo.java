import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Calcolo {

    public static void main(String[] args) {
        String s = input();
        String[] operandi = operandi(s);
        String[] operatori = operatore(s);

        System.out.println(s);
        System.out.println(Arrays.toString(operandi));
        System.out.println(Arrays.toString(operatori));
        System.out.println(result(operatori, operandi));

    }
    public static int result(String[] operatori, String[] operandi){
        int temp = 0;
        String[] operandi2 = Arrays.copyOf(operandi,operandi.length);
        for (int i = 0; i < operandi2.length; i++){
            if (!((i+1)>= operandi2.length)) {
                temp = calculate(operatori[i], operandi2[i], operandi2[i + 1]);
                operandi2[i+1] = String.valueOf(temp);
            }
        }
        return temp;
    }
    public static int calculate(String operatore, String operando1, String operando2){
        int o1 = Integer.parseInt(operando1);
        int o2 = Integer.parseInt(operando2);
        switch (operatore) {
            case "+" -> {
                return o1 + o2;
            }
            case "*" -> {
                return o1 * o2;
            }
            case "-" -> {
                return o1 - o2;
            }
            case "/" -> {
                return o1 / o2;
            }
            case "^" -> {
                return (int)Math.pow(o1, o2);
            }
            default -> throw new IllegalArgumentException("simbolo non supportato");
        }
    }
    public static String input(){
        System.out.println("Inserire l'operazione: ");
        String stringa;
        try (Scanner scanner = new Scanner(System.in)){
            stringa = scanner.nextLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //per prima cosa tolgo tutti gli spazi bianchi
        stringa = stringa.replaceAll(" ", "");
        return stringa;
    }
    public static String[] operatore(String stringa){
        String[] dirty =  stringa.split("[0-9]+");
        String[] clean = new String[dirty.length-1];
        int c = 0;
        for (String e : dirty){
            if(!e.isEmpty()){
               clean[c] = e;
               c++;
            }
        }
        return clean;
    }
    public static String[] operandi(String stringa){
        return stringa.split("[\\+\\-\\*\\^\\/]");
    }
}