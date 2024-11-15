package its.interfaccia_grafica.aeroporto.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import its.interfaccia_grafica.aeroporto.components.Persona;

import java.util.List;

//@Getter nei record i getter ci sono di base. Sono classi final (non possono essere estese)
//create solo per tenere i dati (minimo indispensabile di logica)
//tutti gli attributi sono final, una volta valorizzati non possono essere cambiati
//il .toString() l'.equals() e anche l'.hashcode() sono implementati dalla JDK in automatico
//comunque Overridabili.
@JsonIgnoreProperties(ignoreUnknown = true)
public record Zeppelin(String nome, int posti, List<Persona> passeggeri) {
}
