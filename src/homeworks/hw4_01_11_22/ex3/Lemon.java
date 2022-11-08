package homeworks.hw4_01_11_22.ex3;

import java.util.Objects;

public class Lemon extends Fruit {
    private int sour;

    public Lemon(String name, int price, int sour) {
        super(name, price);
        this.sour = sour;
    }

    public int getSour() {
        return sour;
    }

    public void setSour(int sour) {
        this.sour = sour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lemon lemon = (Lemon) o;
        return super.getName().equals(lemon.getName()) && sour == lemon.getSour();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sour);
    }

    @Override
    public String toString() {
        return "Lemon{" +
                "name='" + super.getName() + '\'' +
                "price='" + super.getPrice() + '\'' +
                "sour='" + sour + '\'' +
                '}' + "\n";
    }
}
