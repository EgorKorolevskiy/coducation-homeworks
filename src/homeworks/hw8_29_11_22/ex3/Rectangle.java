package homeworks.hw8_29_11_22.ex3;

import java.util.Objects;

public class Rectangle {
    private Color color;
    private int a, b;

    public Rectangle() {

    }

    public Rectangle(Color color, int a, int b) {
        this.color = color;
        this.a = a;
        this.b = b;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color=" + color +
                ", a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return color.equals(rectangle.getColor()) && a == rectangle.getA() && b == rectangle.getB();
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, a, b);
    }
}
