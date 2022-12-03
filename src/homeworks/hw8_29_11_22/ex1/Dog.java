package homeworks.hw8_29_11_22.ex1;

public class Dog extends Animal{
    public Dog(String animalType, String name) {
        super(animalType, name);
    }

    @Override
    public void animalSay() {
        super.animalSay();
        System.out.println("Gav!");
    }
}
