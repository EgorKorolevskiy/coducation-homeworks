package homeworks.hw1_11_10_22;

/**
 * Задача 6 Создать класс Rectangle с полями a,b (стороны), цвет, поверхность. Поля a,b являются обязательными для заполнения, остальные нет.
 * Создать перегруженные версии конструкторов, с помощью которых можно проинициализировать объект разными способами, но каждый из которых включает обязательные поля.
 * Создать метод print, который будет выводить значения полей.
 * В мейне создать несколько объектов, задействуя все конструкторы и вывести информацию о них на консоль.
 */

public class Rectangle {
    private double a;
    private double b;
    private String color;
    private String surface;

    public Rectangle(double a, double b) {
     this.a = a;
     this.b = b;
    }

    public Rectangle(double a, double b, String color) {
        this(a, b);
        this.color = color;
    }


    public Rectangle(String color, double a, double b) {
        this(a, b);
        this.surface = color;
    }

    public Rectangle(double a, String surface, double b) {
        this(a, b);
        this.surface = surface;
    }

    public Rectangle(double a, double b, String color, String surface) {
        this(a, b);
        this.color = color;
        this.surface = surface;
    }

    public void print() {
        System.out.println("A: " + a + " B: " + b + " color: " + color + " surface: " + surface);
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(1, 2);
        Rectangle rectangle1 = new Rectangle(1, 2, "Black");
        Rectangle rectangle2 = new Rectangle("Black",1, 2);
        Rectangle rectangle3 = new Rectangle(1, "Black", 2);
        Rectangle rectangle4 = new Rectangle(1, 2, "Black", "down");

        rectangle.print();
        rectangle1.print();
        rectangle2.print();
        rectangle3.print();
        rectangle4.print();
    }
}
