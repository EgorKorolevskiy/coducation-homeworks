package homeworks.hw8_29_11_22.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> listAnimal = new ArrayList<>();
        listAnimal.add(new Dog("Dog", "Bobik"));
        listAnimal.add(new Cat("Cat", "Barsik"));
        listAnimal.add(new Cow("Cow", "WhiteCow"));
        listAnimal.add(new Cat("Cat", "Zhypel"));

        for (int i = 0; i < listAnimal.size(); i++) {
            Animal animal = listAnimal.get(i);
            animal.animalSay();
        }


        // для моего понимания полиморфизма!

        Animal animal = new Animal("Animal", "Animal1");
        Animal dog1 = new Dog("Dog", "Dog1");
        Animal cat1 = new Cat("Cat", "Cat1");
        Animal cow1 = new Cow("Cow", "Cow1");

        System.out.println();

        animal.animalSay();
        dog1.animalSay();
        cat1.animalSay();
        cow1.animalSay();

    }
}
