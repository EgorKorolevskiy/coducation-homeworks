package homeworks.hw4_01_11_22.ex4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PetHouse {
    ArrayList<Cat> cats = new ArrayList<>();

    public void test() {
        cats.add(new Cat("Barsik", 10, "black"));
        cats.add(new Cat("Kisik", 11, "green"));
        cats.add(new Cat("Dusik", 12, "white"));
    }

    public void petHouseService() {
//        test();
        Scanner cns = new Scanner(System.in);
        int inputUser = 0;
        while (inputUser != 5) {
            System.out.println("--------------------\n" +
                    "1. Add some cats into Pethouse\n" +
                    "2. Show all cats\n" +
                    "3. Show cat's weight and color\n" +
                    "4. Show all cats of the same color\n" +
                    "5. Exit program\n" +
                    "--------------------");
            try {
                inputUser = cns.nextInt();
                switch (inputUser) {
                    case 1 -> addSomeCats();
                    case 2 -> showAllCats();
                    case 3 -> printCatsWeightColor();
                    case 4 -> showSameCats();
                    default -> System.out.println("No such point");
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input");
            }
        }
    }

    public void addSomeCats() {
        Scanner cns = new Scanner(System.in);
        System.out.println("Add 1 cat. Enter cat's name: ");
        String name = cns.next();
        System.out.println("Enter cat's weight: ");
        int weight = cns.nextInt();
        System.out.println("Enter cat's color: ");
        String color = cns.next();
        cats.add(new Cat(name, weight, color));

        System.out.println("Do u want to add one more cat? y/n");
        String userInput = cns.next();
        if (userInput.equals("y")) {
            addSomeCats();
        }
    }

    public void showAllCats() {
        System.out.println(cats);
    }

    public void printCatsWeightColor() {
        Scanner cns = new Scanner(System.in);
        System.out.println("Enter cat's name: ");
        String catName = cns.next();

        int index = cats.indexOf(new Cat(catName, 0, ""));
        System.out.println("cat is: " + catName + "\n" + "cat's color is: " + cats.get(index).getColor() + "\n" + "cat's weight is: " + cats.get(index).getWeight());
    }

    public void showSameCats() {
        Scanner cns = new Scanner(System.in);
        System.out.println("Enter cat's color: ");
        String catColor = cns.next();

        int index = cats.indexOf(new Cat("", 0, catColor));

        for (Cat cat : cats) {
            if (cat.getColor().equals(catColor)) {
                System.out.println(cat);
            }
        }
    }
}
