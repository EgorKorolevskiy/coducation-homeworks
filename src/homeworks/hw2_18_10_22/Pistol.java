package homeworks.hw2_18_10_22;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Задача 1 Создать класс Pistol на один патрон.
 * Патрон реализуйте в виде класса Bullet с полями: вес и скорость полета
 * В классе Pistol создать поле в типе данных Bullet.
 * <p>
 * Все поля делайте private.
 * Создайте необходимые конструкторы, геттеры и сеттеры.
 * <p>
 * В классе Pistol реализуйте метод
 * int shot() - возвращает урон от пули, расчитывается по формуле: скорость пули на вес пули.
 * <p>
 * В мейне создайте объект класса Pistol, добавьте ему объект bullet с весом 10 и скоростью 1000.
 * Создайте меню:
 * 1. Узнать урон пули
 * 2. Изменить скорость пули
 * 3. Изменить вес пули
 * 4. Выход
 */

public class Pistol {
    private Bullet bullet;

    public Pistol(Bullet bullet) {
        this.bullet = bullet;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    public int shot() {
        return (int) (bullet.getFlySpeed() * bullet.getWeight());
    }

}

class Bullet {
    private double weight;
    private double flySpeed;

    public Bullet(double weight, double flySpeed) {
        this.weight = weight;
        this.flySpeed = flySpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }
}

class Main {
    private static Bullet bullet = new Bullet(10, 1000);
    private static Pistol pistol = new Pistol(bullet);
    private static final Scanner CNS = new Scanner(System.in);
    private static final String INFO_PISTOL =
            """
                    --------------------
                    1. Узнать урон пули
                    2. Изменить скорость пули
                    3. Изменить вес пули
                    4. Выход
                    --------------------""";

    public static void main(String[] args) {
        selectMenu();
    }

    public static void selectMenu() {
        System.out.println(INFO_PISTOL);
        try {
            int inputUserSelectNumMenu = CNS.nextInt();
            switch (inputUserSelectNumMenu) {
                case (1) -> printMenu1();
                case (2) -> printMenu2();
                case (3) -> printMenu3();
                case (4) -> System.out.println("Завершение программы");
                default -> System.out.println("Нет такого номера");
            }
        } catch (InputMismatchException e) {
            System.out.println("Нет такого пункта меню");
        }
    }

    public static void printMenu1() {
        System.out.println("Урон пули: " + pistol.shot());
        selectMenu();
    }

    public static void printMenu2() {
        System.out.println("Старая скорость пули: " + bullet.getFlySpeed());
        System.out.println("Введите новую скорость пули: ");
        bullet.setFlySpeed(CNS.nextDouble());
        System.out.println("Новая скорость пули: " + bullet.getFlySpeed());
        selectMenu();
    }

    public static void printMenu3() {
        System.out.println("Старый вес пули: " + bullet.getWeight());
        System.out.println("Введите новый вес пули: ");
        bullet.setWeight(CNS.nextDouble());
        System.out.println("Новый вес пули: " + bullet.getWeight());
        selectMenu();
    }
}