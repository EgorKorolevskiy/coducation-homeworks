package homeworks.hw4_01_11_22.ex2;

/**
 * Задача 2 Создать класс Cat с полями
 * имя кота
 * вес кота
 * цвет кота
 *
 * Создайте конструктор класса
 * Переопределите toString, equals (Два кота считаются одинаковыми, если совпадает имя и цвет)
 *
 * В мейне создайте список котов и заполните его любыми пятью котами.
 * Если вдруг окажется, что у вас в списке есть два кота с одинаковым именем и цветом,
 * то indexOf будет возвращать индекс первого кота из списка.
 *
 * Выполните пункты
 * 1. Вывести всех котов
 * 2. Юзер вводит имя кота и его цвет, программа выводит вес кота
 * 3. Удалить кота из списка (юзер вводит имя и цвет)
 */

public class Main {
    public static void main(String[] args) {
        CatService catService = new CatService();
        catService.printCats();
        catService.listOfCats();
    }
}
