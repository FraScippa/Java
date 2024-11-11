package its.interfaccia_grafica.aeroporto;

import its.interfaccia_grafica.aeroporto.components.Compagnia;
import its.interfaccia_grafica.aeroporto.components.aereo.Aereo;
import its.interfaccia_grafica.aeroporto.components.aereo.modelli.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aeroporto {

    public static void main(String[] args) {

        Compagnia Lufthansa = new Compagnia(create1(), true);
        Compagnia Rayanair = new Compagnia(create2(), true);

        Lufthansa.addAerei(List.of(new AirbusA380(),
                new Boeing(),
                new CRJ()));

        Rayanair.addAereo(new Boeing());

        System.out.println("numero aerei Lufthansa: " + Lufthansa.numAerei());
        Lufthansa.listAerei();

        System.out.println("numero aerei Rayanair: " + Rayanair.numAerei());
        Rayanair.listAerei();
    }
    public static List<Aereo> create1(){
        return new ArrayList<>(Arrays.asList(
            new Airbus320(),
            new ATR(),
            new Boeing(),
            new AirbusA380(),
            new CRJ()));
    }
    public static List<Aereo> create2(){
        return new ArrayList<>(Arrays.asList(
            new Boeing(),
            new ATR(),
            new AirbusA380(),
            new Airbus320()));
    }
}
