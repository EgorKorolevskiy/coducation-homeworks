package homeworks.hw4_01_11_22.ex3;

import java.util.Objects;

public class Apple extends Fruit {
    private String appleColor;

    public Apple(String name, int price, String appleColor) {
        super(name, price);
        this.appleColor = appleColor;
    }


    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Apple apple = (Apple) o;
        return super.getName().equals(apple.getName()) && appleColor.equals(apple.appleColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), appleColor);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + super.getName() + '\'' +
                "price='" + super.getPrice() + '\'' +
                "appleColor='" + appleColor + '\'' +
                '}' + "\n";
    }
}
