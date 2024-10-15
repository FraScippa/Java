import animals.Dog;
import implementazione.Animal;
import mestieri.Medico;

import java.time.LocalDate;
import java.util.Random;
//": per stringhe ':1 solo carattere
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Peppino","Scalzo");
        person1.greet();

        Medico medico1 = new Medico("Ferdinando","Scalchi","Pediatra");
        medico1.welcome();

        Dog dog1 = new Dog("Noè","Border Collie", LocalDate.parse("2012-08-10"));
        dog1.makeSound();
        System.out.println(dog1.calculationAge());
    }
}
