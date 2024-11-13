package its.interfaccia_grafica.aeroporto.components;

import its.interfaccia_grafica.aeroporto.components.aereo.Aereo;
import org.jetbrains.annotations.NotNull;


import java.util.List;
import java.util.Scanner;

public class Biglietteria {
    private final Agenzia agenzia;

    public void prenotaPosti(Object pass) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Compagnia 1: " + agenzia.getComp1() + ", Compagnia 2: " + agenzia.getComp2());
        System.out.println("Selezionare 1 compagnia: ");
        int compagnia = scanner.nextInt();
        switch (compagnia) {
            case 1 -> {
                Compagnia comp = agenzia.getComp1();
                typeCheck(pass, comp);
            }
            case 2 -> {
                Compagnia comp = agenzia.getComp2();
                typeCheck(pass, comp);
            }
        }
    }
    @SuppressWarnings("unchecked")
    private void typeCheck(Object pass, Compagnia comp) {
        if (pass instanceof Persona passeggero) {
            complPrenotazione(passeggero, comp);
        } else if (pass instanceof List<?> lista && lista.getFirst() instanceof Persona){
            complPrenotazione((List<Persona>) lista, comp);
        } else {
            System.out.println("Tipo non supportato");
        }
    }
    private static void complPrenotazione(@NotNull List<Persona> pass, @NotNull Compagnia comp) {
        comp.listAerei();
        System.out.println("selezionare l'aereo desiderato con un numero: ");
        Scanner scanner = new Scanner(System.in);
        int scelta = scanner.nextInt();
        if (scelta <= comp.numAerei()) {
            Aereo a1 = comp.getAerei().get(scelta-1);
            a1.addPasseggeri(pass);
            System.out.println("I passeggeri " + pass + " sono stati aggiunti con successo all'" + a1);
        }
    }
    private static void complPrenotazione(@NotNull Persona pass, @NotNull Compagnia comp) {
        comp.listAerei();
        System.out.println("selezionare l'aereo desiderato con un numero: ");
        Scanner scanner = new Scanner(System.in);
        int scelta = scanner.nextInt();
        if (scelta <= comp.numAerei()) {
            Aereo a1 = comp.getAerei().get(scelta-1);
            a1.addPasseggero(pass);
            System.out.println("Il passeggero " + pass + " è stato aggiunto con successo all'" + a1);
        }
    }

    public Biglietteria(Agenzia agenzia) {
        this.agenzia = agenzia;
    }
    public Agenzia getAgenz() {
        return agenzia;
    }}
