import java.util.*;
import java.util.stream.Collectors;

public class AnalisiVoti {

    static Map<String, Map<String, Double>> studente = new HashMap<>();
    public static void main(String[] args) {

        System.out.println(addGrades("Nicolò", Map.of("DISCIPLINE PITTORICHE", 4.5)));
        System.out.println(studente);
        System.out.println(updateGrades("Nicolò", "Educazione Fisica", 2.5));
        System.out.println(studente);
        System.out.println(updateGrades("Nicolò", "Discipline Pittoriche", 2.5));
        System.out.println(studente);
    }
    // addGrades
    // updateGrades
    // calculateAvgGrades
    // findTopScorer

    public static String finTopScorer(){
        return "f";
    }

    public static double calculateAvgGrades(String nome){
        return 0.0;
    }

    public static boolean updateGrades(String nome, String materia, Double voto){
        if (studente.containsKey(nome) && studente.get(nome).containsKey(materia.toLowerCase())){
            studente.replace(nome, studente.get(nome), Map.of(materia.toLowerCase(), voto));
            return true;
        } return false;
    }

    public static boolean addGrades(String nome, Map<String, Double> materia){
        Map<String, Double> corretta = materia.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        entry -> entry.getKey().toLowerCase(),
                                Map.Entry::getValue
                ));
        return studente.putIfAbsent(nome, corretta) == null;
    }
}
