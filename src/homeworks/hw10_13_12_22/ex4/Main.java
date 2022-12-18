package homeworks.hw10_13_12_22.ex4;

import input.Input;

public class Main {
    public static MyList myList = null;
    public static void main(String[] args) {


        System.out.println("Введите 1 или 2");
        int userInput = Input.nextInt();

        if (userInput == 1) {
            System.out.println("Реализация UniqueList");
            myList = new UniqueList();
        } else if (userInput == 2) {
            System.out.println("Реализация NotUniqueList");
            myList = new NotUniqueList();
        }
        menu();
    }

    public static void menu() {
        int userInputMenu = 0;
        while (userInputMenu != 3) {
            System.out.println("--------------------\n" +
                    "1. Add number\n" +
                    "2. Print all numbers\n" +
                    "3. Exit\n" +
                    "--------------------");
            userInputMenu = Input.nextInt();
            switch (userInputMenu) {
                case 1 -> menu1();
                case 2 -> menu2();
                case 3 -> System.out.println("Exit program" );
            }
        }
    }

    public static void menu1() {
        System.out.println("Введите число");
        int userCns = Input.nextInt();
        myList.add(userCns);
        System.out.println("Хотите добавить еще число? y/n");
        String userRepeat = Input.next();
        if (userRepeat.equals("y")) {
            menu1();
        } else if (userRepeat.equals("n")) {
            return;
        }
    }

    public static void menu2() {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
