package its.interfaccia_grafica.aeroporto.components;

import its.interfaccia_grafica.aeroporto.components.aereo.Aereo;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Scanner;

public class Biglietteria {
    private final Agenzia agenz;

    public void prenotaPosti(int num, int nPosti, @Nullable Persona pass1, @Nullable List<Persona> pass) {
        switch (num) {
            case 1 -> {
                Compagnia comp1 = agenz.getComp1();
                comp1.listAerei();
                System.out.println("selezionare l'aereo desiderato con un numero: ");
                Scanner scanner = new Scanner(System.in);
                int scelta = scanner.nextInt();
                if (scelta <= comp1.numAerei()) {
                    Aereo a1 = comp1.getAerei().get(scelta);
                    if (pass1 != null) {
                        a1.addPasseggero(pass1);
                        System.out.println("Il passeggero" + pass1 + "è stato aggiunto con successo all'aereo" + a1);
                    } else {
                        a1.addPasseggeri("I passeggeri" + pass + "sono stati aggiunti con successo all'aereo" + a1);
                    }
                }
            }
            case 2 -> {
                Compagnia comp2 = agenz.getComp2();
                comp2.listAerei();
                System.out.println("selezionare l'aereo desiderato con un numero: ");
                Scanner scanner = new Scanner(System.in);
                int scelta = scanner.nextInt();
                if (scelta <= comp2.numAerei()) {
                    Aereo a1 = comp2.getAerei().get(scelta);
                    if (pass1 != null) {
                        a1.addPasseggero(pass1);
                        System.out.println("Il passeggero" + pass1 + "è stato aggiunto con successo all'aereo" + a1);
                    } else {
                        a1.addPasseggeri("I passeggeri" + pass + "sono stati aggiunti con successo all'aereo" + a1);
                    }
                }

            }
        }
    }

    public Biglietteria(Agenzia agenz) {
        this.agenz = agenz;
    }
    public Agenzia getAgenz() {
        return agenz;
    }}
