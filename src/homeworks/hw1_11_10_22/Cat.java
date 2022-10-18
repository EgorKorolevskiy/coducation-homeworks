package homeworks.hw1_11_10_22;

/**
 * Задача 5 Создать класс Cat с полями имя, возраст, любимое блюдо. Поле имя является обязательным, остальные нет.
 * Создать несколько перегруженных конструкторов, которые будут связаны между собой для инициализации полей.
 * Создать метод print, который будет выводить на консоль значения всех полей.
 * В мейне создать несколько объектов класса Cat, задействовав все конструкторы,
 * вывести с помощью метода print значения полей каждого объекта
 */

public class Cat {
    private String name;
    private int age;
    private String favoriteDish;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavoriteDish() {
        return favoriteDish;
    }

    public void setFavoriteDish(String favoriteDish) {
        this.favoriteDish = favoriteDish;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this(name);
        this.age = age;
    }

    public Cat(String name, int age, String favoriteDish) {
        this(name, age);
        this.favoriteDish = favoriteDish;
    }

    public void print() {
        System.out.println("Name: " + name + " age: " + age + " favorite dish: " + favoriteDish);
    }


    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Barsik", 21);
        Cat cat3 = new Cat("Barsik", 21, "Fish");

        cat1.print();
        cat2.print();
        cat3.print();
    }
}
