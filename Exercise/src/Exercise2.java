import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise2 {
    private static List<String> words = List.of(
            "apple",
            "banana",
            "cherry",
            "blueberry",
            "pinapple",
            "orange",
            "starfruit"
    );
    public static void main(String[] args) {
        System.out.println(mappingWords(words));
    }
    public static Map<String, Integer> mappingWords(List<String> words) {
        Map<String, Integer> results = new HashMap<>();

        for (String word : words) {
            results.put(word, word.length());
        }
        return results;
    }
}
