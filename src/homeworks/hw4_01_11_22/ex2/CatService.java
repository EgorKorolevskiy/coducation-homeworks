package homeworks.hw4_01_11_22.ex2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CatService {

    ArrayList<Cat> catsList = new ArrayList<>();

    public void listOfCats() {
        catsList.add(new Cat("Barsik", 5, "black"));
        catsList.add(new Cat("Dusik", 6, "red"));
        catsList.add(new Cat("Masik", 9, "brown"));
        catsList.add(new Cat("Sun", 4, "yellow"));
        catsList.add(new Cat("Krasti", 11, "blue"));
    }

    public void printCats() {
        listOfCats();
        Scanner cns = new Scanner(System.in);
        int inputUser = 0;
        while (inputUser != 4) {
            System.out.println("--------------------\n" +
                    "1. Show all cats\n" +
                    "2. Show user cat\n" +
                    "2. Delete user cat\n" +
                    "--------------------");
            try {
                inputUser = cns.nextInt();
                switch (inputUser) {
                    case 1 -> showAllCats();
                    case 2 -> printUserCat();
                    case 3 -> deleteUserCat();
                    default -> System.out.println("No such point");
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input");
            }
        }
    }

    public void showAllCats() {
        for (Cat cat : catsList) {
            System.out.println(cat);
        }
    }

    public void printUserCat() {
        Scanner cns = new Scanner(System.in);
        System.out.print("Enter cat's name: ");
        String userCatName = cns.next();
        System.out.print("Enter cat's color: ");
        String userColorCat = cns.next();

        int index = catsList.indexOf(new Cat(userCatName, 0, userColorCat));
        System.out.println("cat is: " + userCatName + "\n" + "cat's color is: " + userColorCat + "\n" + "cat's weight is: " + catsList.get(index).getWeightCat());
    }

    public void deleteUserCat() {
        Scanner cns = new Scanner(System.in);
        System.out.print("Enter cat's name: ");
        String userCatName = cns.next();
        System.out.print("Enter cat's color: ");
        String userColorCat = cns.next();

        int index = catsList.indexOf(new Cat(userCatName,0, userColorCat));
        catsList.remove(index);

    }

    public void testCat() {
        System.out.println(catsList.get(2).equals(catsList.get(3)));
    }
}
