package its.interfaccia_grafica.aeroporto;

import its.interfaccia_grafica.aeroporto.components.Agenzia;
import its.interfaccia_grafica.aeroporto.components.Biglietteria;
import its.interfaccia_grafica.aeroporto.components.Compagnia;
import its.interfaccia_grafica.aeroporto.components.Persona;
import its.interfaccia_grafica.aeroporto.components.aereo.Aereo;
import its.interfaccia_grafica.aeroporto.components.aereo.modelli.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aeroporto {

    public static void main(String[] args) {

        Compagnia Lufthansa = new Compagnia("Lufthansa", create1(), true);
        Compagnia Rayanair = new Compagnia("Rayanair", create2(), true);
        Lufthansa.addAerei(List.of(new AirbusA380(),
                new Boeing(),
                new CRJ()));

        Rayanair.addAereo(new Boeing());

        Biglietteria b1 = new Biglietteria(new Agenzia(Lufthansa, Rayanair));

        b1.prenotaPosti(List.of(new Persona("Nicolò", "Di Silvestro", "nico@pessimo.it", "0000 0000 0000 0000"),
                                                new Persona("Nicola", "De Silvestri", "nico@pezzimo.it", "1000 0000 0000 0000"),
                                                new Persona("Niccolò", "Silvester", "nico@pessimerrimo.it", "2000 0000 0000 0000")));


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
