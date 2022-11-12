package homeworks.hw4_01_11_22.ex1;

import java.util.ArrayList;

/**
 * Задача 1 Создайте программу, представляющую арсенал с оружием.
 * Создайте класс Gun с полями:
 * название оружия
 * урон от оружия
 * цена оружия
 *
 * Создайте конструктор класса
 * Переопределите toString, equals (два оружия считаются одинаковыми, если совпадает название, то есть название оружия - это уникальное значение)
 *
 *
 * В мейне создайте список оружий и заполните его пятью любыми оружиями
 * Выполните пункты:
 * 1. Вывести все оружия на консоль
 * 2. Найти самое мощное по урону оружие
 * 3. Юзер вводит название оружия, программа выводит его урон и цену
 * 4. Удалить любое оружие из списка. Юзер вводит название оружия для удаления.
 * (после удаления выведите список оружий на консоль, чтобы убедиться в успешном удалении)
 */

public class Main {

    public static void main(String[] args) {
        GunService gunService = new GunService();
        gunService.printGunService();
    }
}