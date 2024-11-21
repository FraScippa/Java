import java.util.HashMap;
public class Fibonacci {

    public static void main(String[] args) {
        int n = 7;
        System.out.println("il numero " + n + " di fibonacci è " + fibonacci(n));

    }
    private static HashMap<Integer, Integer> cronologia = new HashMap<>();

    public static int fibonacci(int n) {
        if (cronologia.containsKey(n)) {
            return cronologia.get(n);
        }
        if (n <= 2) {
            return 1;
        } else {
            int result =fibonacci(n-1) + fibonacci(n-2);
            cronologia.put(n, result);
            return result;
        }
    }





}
