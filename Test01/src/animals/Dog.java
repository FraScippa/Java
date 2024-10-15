package animals;

import implementazione.Animal;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String s1, String s2, LocalDate d1) {
        super(s1, s2, d1);
    }

    @Override
    public void makeSound() {
        System.out.println("I am a dog and I go Woof!");
    }
}
