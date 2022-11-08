package homeworks.hw4_01_11_22.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitsService {
    ArrayList<Apple> appleList = new ArrayList<>();

    ArrayList<Lemon> lemonList = new ArrayList<>();

    public void listsOfFruits(){
        appleList.add(new Apple("apple1", 10, "red"));
        appleList.add(new Apple("apple2", 11, "semi-red"));
        appleList.add(new Apple("apple3", 12, "green"));
        appleList.add(new Apple("apple4", 13, "orange"));
        appleList.add(new Apple("apple5", 14, "white"));

        lemonList.add((new Lemon("lemon1", 10, 5)));
        lemonList.add((new Lemon("lemon2", 11, 4)));
        lemonList.add((new Lemon("lemon3", 12, 3)));
        lemonList.add((new Lemon("lemon4", 13, 2)));
        lemonList.add((new Lemon("lemon5", 14, 1)));
    }

    public void printFruits() {
        listsOfFruits();
        Scanner cns = new Scanner(System.in);
        int userInput = 0;
        while (userInput != 5) {
            System.out.println("--------------------\n" +
                    "1. Show all apples\n" +
                    "2. Show user price apple\n" +
                    "3. Show all lemons\n" +
                    "4. Show user price lemon\n" +
                    "5. Exit program\n" +
                    "--------------------");
            userInput = cns.nextInt();
            switch (userInput) {
                case 1 -> showAllApples();
                case 2 -> userApple();
                case 3 -> showAllLemons();
                case 4 -> showUserLemons();
                case 5 -> System.out.println("Exit program");
            }
        }
    }

    public void showAllApples() {
        System.out.println(appleList);
    }

    public void userApple() {
        Scanner cns = new Scanner(System.in);
        System.out.print("Enter apple's name: ");
        String appleName = cns.next();
        System.out.print("Enter apple's color: ");
        String appleColor = cns.next();

        int index = appleList.indexOf(new Apple(appleName, 0, appleColor));
        System.out.println("Apple's name is: " + appleName + "\n" + "Apple's color is: " + appleColor + "\n" + "Apple's price is: " + appleList.get(index).getPrice());
    }

    public void showAllLemons()  {
        System.out.println(lemonList);
    }

    public void showUserLemons() {
        Scanner cns = new Scanner(System.in);
        System.out.print("Enter lemon's name: ");
        String lemonName = cns.next();
        System.out.print("Enter lemon's sour: ");
        int lemonSour = cns.nextInt();

        int index = lemonList.indexOf(new Lemon(lemonName, 0, lemonSour));
        System.out.println("Lemon's name is: " + lemonName + "\n" + "Lemon's sour is: " + lemonSour + "\n" + "Lemon's price is: " + lemonList.get(index).getPrice());
    }




    public void test() {
        System.out.println(lemonList.get(1).equals(lemonList.get(3)));
    }
}
