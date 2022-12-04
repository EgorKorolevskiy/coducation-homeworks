package homeworks.hw8_29_11_22.ex1;

public class Animal {
    private String animalType;
    private String name;

    public Animal(String animalType, String name) {
        this.animalType = animalType;
        this.name = name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getName() {
        return name;
    }

    public void animalSay() {
        System.out.println("Животное " + getAnimalType() + " по имени " + getName() + " говорит: ");
    }
}
