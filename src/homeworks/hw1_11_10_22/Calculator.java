package homeworks.hw1_11_10_22;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Задача 3 Создать класс Calculator.
 * Методы:
 * int sum(int a, int b) - принимает 2 числа через параметры и возвращает сумму чисел
 * int minus(int a, int b) - возвращает разницу чисел
 * mult - принимает 2 числа через параметры и возвращает произведение чисел
 * divide - принимает 2 числа через параметры и возвращает результат деления чисел
 * greater - принимает 2 числа через параметры и возвращает нибольшее из двух чисел или любое из них, если числа равны
 * lesser - принимает 2 числа через параметры и возвращает наименьшее из двух чисел или любое из них, если числа равны
 * abs - принимает 1 положительное или отрицательное число и возвращает его по модулю (со знаком плюс).
 * Модуль это число со знаком плюс. Пример: модуль числа 5 равен 5, модуль числа -5 равен 5.
 * <p>
 * <p>
 * В мейне создайте объект класса Calculator и меню:
 * 1. Сложить (нужно считать два числа и вызвать метод sum)
 * 2. Умножить (нужно считать два числа вызвать метод mult)
 * 3. Делить (нужно считать два числа вызвать метод divide)
 * 4. Вычесть (нужно считать два числа вызвать метод mult)
 * 4. Наибольшее (нужно считать два числа вызвать метод greater)
 * 5. Наименьшее (нужно считать два числа вызвать метод lesser)
 * 6. Модуль (нужно считать одно число вызвать метод abs)
 * 7. Выход
 */

public class Calculator {
    public int sum(int a, int b) {
        return a + b;

    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int greater(int a, int b) {
        return Math.max(a, b);
    }

    public int lesser(int a, int b) {
        return Math.min(a, b);
    }

    public int abs(int a) {
        return Math.abs(a);
    }

    public void printInfoCalculator(int answer) {
        System.out.println("�����: " + answer);
    }
}

class Main3 {
    private static final Calculator CALCULATOR = new Calculator();
    private static int answer;
    private static final Scanner CNS = new Scanner(System.in);
    private static final String INFO_CALCULATOR =
            """
                    --------------------
                    1. Сложить (нужно считать два числа и вызвать метод sum)
                    2. Умножить (нужно считать два числа вызвать метод mult)
                    3. Делить (нужно считать два числа вызвать метод divide)
                    4. Вычесть (нужно считать два числа вызвать метод mult)
                    5. Наибольшее (нужно считать два числа вызвать метод greater)
                    6. Наименьшее (нужно считать два числа вызвать метод lesser)
                    7. Модуль (нужно считать одно число вызвать метод abs)
                    8. Выход
                    --------------------""";

    public static void main(String[] args) {
        printMenuCalculator();
    }

    public static void printMenuCalculator() {
        System.out.println(INFO_CALCULATOR);
        try {
            int inputUserSelectNum = CNS.nextInt();
            switch (inputUserSelectNum) {
                case (1) -> printMenu1();
                case (2) -> printMenu2();
                case (3) -> printMenu3();
                case (4) -> printMenu4();
                case (5) -> printMenu5();
                case (6) -> printMenu6();
                case (7) -> printMenu7();
                case (8) -> printMenu8();
                default -> System.out.println("Нет такого номера");
            }
        } catch (InputMismatchException e) {
            System.out.println("Нет такого пункта меню");
        }
    }
    public static int scanNum1() {
        System.out.println("Введите первое число: ");
        return CNS.nextInt();
    }

    public static int scanNum2() {
        System.out.println("Введите второе число: ");
        return CNS.nextInt();
    }

    public static void printMenu1() {
        int a = scanNum1();
        int b = scanNum2();
        answer = CALCULATOR.sum(a, b);
        CALCULATOR.printInfoCalculator(answer);
    }

    public static void printMenu2() {
        int a = scanNum1();
        int b = scanNum2();
        answer = CALCULATOR.mult(a, b);
        CALCULATOR.printInfoCalculator(answer);
    }

    public static void printMenu3() {
        int a = scanNum1();
        int b = scanNum2();
        answer = CALCULATOR.divide(a, b);
        CALCULATOR.printInfoCalculator(answer);
    }

    private static void printMenu4() {
        int a = scanNum1();
        int b = scanNum2();
        answer = CALCULATOR.minus(a, b);
        CALCULATOR.printInfoCalculator(answer);
    }

    private static void printMenu5() {
        int a = scanNum1();
        int b = scanNum2();
        answer = CALCULATOR.greater(a, b);
        CALCULATOR.printInfoCalculator(answer);
    }

    private static void printMenu6() {
        int a = scanNum1();
        int b = scanNum2();
        answer = CALCULATOR.lesser(a, b);
        CALCULATOR.printInfoCalculator(answer);
    }

    private static void printMenu7() {
        int a = scanNum1();
        answer = CALCULATOR.abs(a);
        CALCULATOR.printInfoCalculator(answer);
    }

    private static void printMenu8() {
        System.out.println("Завершение программы");
        return;
    }
}
