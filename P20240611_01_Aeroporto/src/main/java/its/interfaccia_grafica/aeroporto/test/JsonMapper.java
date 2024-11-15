package its.interfaccia_grafica.aeroporto.test;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonMapper {

    public static void main(String[] args) {

        File aerei = new File("C:\\Users\\Francesca\\Desktop\\ITS_ACCADEMY\\Java\\Esercizi\\P20240611_01_Aeroporto\\src\\main\\resources\\aerei\\aerei.json");
        System.out.println(mapp(aerei, Zeppelin.class));

    }

    /**
     *
     * @param json
     * @param classe
     * @return {@code T} tipo di ritorno
     * @param <T> dichiarazione di T (T: Generics)
     */
    public static <T> T mapp(String json, Class<T> classe) {
        ObjectMapper obj = new ObjectMapper();
        try {
            return obj.readValue(json, classe);
        } catch (Exception e) {
            e.printStackTrace();
        } return null;
    }
    public static <T> T mapp(File json, Class<T> classe) {
        ObjectMapper obj = new ObjectMapper();
        try {
            return obj.readValue(json, classe);
        } catch (Exception e) {
            e.printStackTrace();
        } return null;
    }

}
