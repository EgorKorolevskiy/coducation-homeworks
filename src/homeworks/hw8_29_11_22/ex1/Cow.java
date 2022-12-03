package homeworks.hw8_29_11_22.ex1;

public class Cow extends Animal{
    public Cow(String animalType, String name) {
        super(animalType, name);
    }

    @Override
    public void animalSay() {
        super.animalSay();
        System.out.println("Moow");
    }
}
