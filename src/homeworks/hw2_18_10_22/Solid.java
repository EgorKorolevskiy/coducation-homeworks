package homeworks.hw2_18_10_22;

import java.util.Random;
import java.util.Scanner;

/**
 * Задача 2 Реализовать в коде в виде объекта обычную шариковую ручку.
 * Создайте класс Solid (стержень) с полями: цвет чернил и количество чернил в процентах.
 * Например, есть стержень наполовину пуст, значит количество чернил равно 50%.
 * Создайте класc Pen(ручка) с полем: стержень (переменная типа Solid).
 * <p>
 * Все поля сделайте private.
 * Создайте необходимые конструкторы, сеттеры и геттеры.
 * <p>
 * В классе Pen создайте метод
 * void write(String text) - выводит на консоль сообщение text с пометкой цвета.
 * Например: write("hello") выведет: hello (black)
 * Каждый вызов метода write уменьшает количество черник на случайное кол-во процентов в диапазоне от 10 до 20.
 * Например, было 100% чернил, вывели одну фразу, стало 85%.
 * Если чернила кончились, метод должен вывести: недостаточно чернил
 * <p>
 * В мейне создайте объект класса Pen черного цвета.
 * С помощью метода write израсходуйте все чернила (с помощью цикла).
 * Далее юзер вводит с консоли новый цвет и вам нужно вставить в объект класса Pen новый объект класса Solid для замены стрежня с введенным с консоли цветом.
 * <p>
 * Например:
 * hello world (blue)
 * hello world (blue)
 * hello world (blue)
 * hello world (blue)
 * hello world (blue)
 * Недостаточно чернил
 * Выберите новый цвет для замены стрежня: red
 * red
 * red
 * red
 * red
 * red
 */

public class Solid {
    private String colorInk;
    private int amountInk;

    public Solid(String colorInk, int amountInk) {
        this.colorInk = colorInk;
        this.amountInk = amountInk;
    }

    public String getColorInk() {
        return colorInk;
    }

    public void setColorInk(String colorInk) {
        this.colorInk = colorInk;
    }

    public int getAmountInk() {
        return amountInk;
    }

    public void setAmountInk(int amountInk) {
        this.amountInk = amountInk;
    }
}

class Pen {
    private Solid solid;

    public Pen(Solid solid) {
        this.solid = solid;
    }

    public Solid getSolid() {
        return solid;
    }

    public void setSolid(Solid solid) {
        this.solid = solid;
    }

    public void write(String text) {
        Random rnd = new Random();
        int inkRnd = rnd.nextInt(10, 20);
        int inkResult = solid.getAmountInk() - inkRnd;
        solid.setAmountInk(inkResult);
        System.out.println(text + " " + solid.getColorInk());

        // по ТЗ можно не выводить % остаток чернил
        System.out.println(solid.getAmountInk() + " %");

    }
}


class Main_2222 {
    /**
     * Сейчас точно все будет хорошо.... И без статики!
     */

    public static void main(String[] args) {
        PenService1 penService1 = new PenService1();
        penService1.startTask();
    }
}

class PenService1 {
    public void startTask() {
        Pen pen1 = new Pen(new Solid("Black", 100));
        //Pen pen2 = new Pen(new Solid("Black", 100));
        writePen(pen1);
        printUser(pen1);
        writePen(pen1);
    }

    public void writePen(Pen pen) {
        //С помощью метода write израсходуйте все чернила (с помощью цикла).
        while (pen.getSolid().getAmountInk() >= 0) {
            pen.write("hello");
        }
        System.out.println("Недостаточно чернил");
    }
    public void printUser(Pen pen) {
        //Далее юзер вводит с консоли новый цвет
        Scanner cns = new Scanner(System.in);
        System.out.println("Введите новый цвет: ");
        String newColorSolid = cns.next();

        //вам нужно вставить в объект класса Pen новый объект класса Solid для замены стрежня с введенным с консоли цветом.
        pen.setSolid(new Solid(newColorSolid, 100));
    }
}