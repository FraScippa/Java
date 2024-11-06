import components.Aereo;
import components.Compagnia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aeroporto {

    public static void main(String[] args) {

        ArrayList<Aereo> aerei = new ArrayList<>(Arrays.asList(
                    new Aereo(180),
                    new Aereo(170),
                    new Aereo(190),
                    new Aereo(270),
                    new Aereo(6969)));

        Compagnia Lufthansa = new Compagnia(aerei, true);


        Lufthansa.addAerei(List.of(new Aereo(200),
                                    new Aereo(300),
                                    new Aereo(228)));

        System.out.println(STR."numero aerei: \{Lufthansa.numAerei()}");
        Lufthansa.listAerei();
    }

}
