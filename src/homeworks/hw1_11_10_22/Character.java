package homeworks.hw1_11_10_22;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


/**
 * Задача 1 Создать класс Character (персонаж игры) с полями
 * <p>
 * название персонажа
 * класс персонажа (войн, маг, лекарь)
 * урон персонажа
 * Создайте метод printInfo для вывода атрибутов персонажа
 * <p>
 * В мейне создайте массив на 5 объектов класса Character, заполните его объектами класса Character.
 * Заполнение можете сделать вручную, либо в цикле.
 * <p>
 * После заполнения выведите на консоль информацию о всех персонажах (их название, класс, урон).
 * <p>
 * Далее выполните задачи:
 * 1. Юзер вводит с консоли требуемый класс персонажа, программа должна вывести из массива всех персонажей, чей класс совпадает с введенным с консоли.
 * 2. Юзер вводит с консоли урон, которым должен обладать персонаж. Выведите на консоль всех персонажей, чей урон больше или равен введенному с консоли
 * 3. Юзер вводит класс и урон. Выведите всех персонажей, чей класс совпадает с введенным и чей урон больше или равен введенному.
 */
public class Character {
    private String nameCharacter;
    private String classCharacter;
    private int damageCharacter;

    public String getNameCharacter() {
        return nameCharacter;
    }

    public void setNameCharacter(String nameCharacter) {
        this.nameCharacter = nameCharacter;
    }

    public String getClassCharacter() {
        return classCharacter;
    }

    public void setClassCharacter(String classCharacter) {
        this.classCharacter = classCharacter;
    }

    public int getDamageCharacter() {
        return damageCharacter;
    }

    public void setDamageCharacter(int damageCharacter) {
        this.damageCharacter = damageCharacter;
    }

    public void printInfo() {
        System.out.println("Name: " + getNameCharacter() + " Class: " + getClassCharacter() + " Damage: " + getDamageCharacter());
    }


}

class Main {
    private static final String INFO_PROGRAM =
            """
                    ------------------------------
                    1. Вывести всю инфу о персонажах с одинаковым классом
                    2. Вывести персонажей, чей урон больше или равен введенному с консоли
                    3. Вывести всех персонажей, чей класс совпадает с введенным и чей урон больше или равен введенному
                    ------------------------------""";
    private static final Scanner CNS = new Scanner(System.in);
    public static final Character[] ARR_CHARACTER = createArrClasses();

    public static void main(String[] args) {
        System.out.println(INFO_PROGRAM);
        printInfoProgramResult();
        CNS.close();
    }

    public static Character[] createArrClasses() {
        Character[] arr = new Character[5];
        Random rnd = new Random();
        String[] names = {"Arandir", "Legolas", "Gendalf", "Sauron", "Galadriel"};
        String[] classes = {"Warrior", "Mag", "Healer"};
        for (int i = 0; i < arr.length; i++) {
            Character character = new Character();
            int nameIndex = rnd.nextInt(names.length);
            character.setNameCharacter(names[nameIndex]);
            int classIndex = rnd.nextInt(classes.length);
            character.setClassCharacter(classes[classIndex]);
            character.setDamageCharacter(rnd.nextInt(200) + 100);
            arr[i] = character;
            arr[i].printInfo();
        }
        return arr;
    }

    public static void printInfoProgramResult() {
        System.out.println("Введите номер пункта: ");
        try {
            int inputNumCase = CNS.nextInt();
            switch (inputNumCase) {
                case (1) -> printCase1();
                case (2) -> printCase2();
                case (3) -> printCase3();
                default -> System.out.println("Нет такого номера!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Я не знаю как работать с lombook :(");
        }
    }

    public static void printCase1() {
        System.out.println("Введите класс персонажа: ");
        try {
            String className = CNS.next();
            for (Character character : ARR_CHARACTER) {
                if (character.getClassCharacter().equals(className)) {
                    character.printInfo();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Нет такого класса");
        }
    }

    public static void printCase2() {
        System.out.println("Введите урон: ");
        try {
            int damage = CNS.nextInt();
            for (Character character : ARR_CHARACTER) {
                if (character.getDamageCharacter() >= damage) {
                    character.printInfo();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Нет такого класса");
        }
    }

    public static void printCase3() {
        try {
            System.out.println("Введите класс: ");
            String className = CNS.next();
            System.out.println("Введите урон: ");
            int damage = CNS.nextInt();
            for (Character character : ARR_CHARACTER) {
                if (character.getClassCharacter().equals(className) && character.getDamageCharacter() >= damage) {
                    character.printInfo();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Нет такого класса");
        }
    }
}