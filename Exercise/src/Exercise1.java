//Scrivi una funzione che accetti un dizionario di prodotti con i relativi prezzi e
//restituisca un nuovo dizionario con solo i prodotti che hanno un prezzo inferiore a 50,
//ma con i prezzi aumentati del 10% e arrotondati a due cifre decimali.

import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    private static Map<String, Float> shop = /*new HashMap<>();*/ Map.of(
            "prodotto1", 30.0f,
            "prodotto2", 60.0f,
            "prodotto3", 45.0f);
    public static void main(String[] args) {
    /*shop.put("prodotto1", 30.0F);
    shop.put("prodotto2", 60.0F);
    shop.put("prodotto3", 45.0F);*/
    System.out.println(filterAndMap(shop));
    }

//def filtra_e_mappa(prodotti: dict[str:float]) -> dict[str:float]:

    private static Map<String, Float> filterAndMap (Map<String, Float> products) {

        Float ditto;
        Map<String, Float> results = new HashMap<>();

        for (Map.Entry<String, Float> entry : products.entrySet()) { //la mappa non essendo ciclabile ha bisogno di un altro oggetto ausiliare chiamato EntrySet.
            ditto = entry.getValue();
            if (ditto < 50)
                results.put(entry.getKey(), (float) (ditto + ditto * 0.1)); //results[prodotto1] = v + (v*01)
        }
        return results;
    }
}
