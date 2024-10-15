import java.util.List;

//Scrivi una funzione che moltiplica tutti i numeri interi di una lista che sono minori di un dato valore intero definito threshold.
public class Exercise3 {
    private static List<Integer> numbers = List.of(1, 10, 20, 30);
    private static List<Integer> numbers1 = List.of(15, 5, 25);
    private static List<Integer> numbers2 = List.of(3, 5, 8);
    private static List<Integer> numbers3 = List.of(50, 60, 70);
    private static List<Integer> numbers4 = List.of(2, 5, 1);

    public static void main(String[] args) {
        System.out.println(multiplyNumbers(numbers, 30));
        System.out.println(multiplyNumbers(numbers1,20));
        System.out.println(multiplyNumbers(numbers2,10));
        System.out.println(multiplyNumbers(numbers3,25));
        System.out.println(multiplyNumbers(numbers4,1));
    }
    public static int multiplyNumbers(List<Integer> numbers, int threshold){
        int ditto = 1;
        for (int number : numbers){
            if (number < threshold){
                ditto *= number;
            }
        }
        return ditto;
    }
}
