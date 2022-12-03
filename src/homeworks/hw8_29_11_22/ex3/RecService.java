package homeworks.hw8_29_11_22.ex3;

import input.Input;

import java.util.ArrayList;
import java.util.List;

public class RecService {

    List<Rectangle> listRec = new ArrayList<>();

    public void startRectangleMenu() {
        int userInput = 0;
        while (userInput != 4) {
            System.out.println("--------------------\n" +
                    "1. Add figure\n" +
                    "2. Show all equals figure by color\n" +
                    "3. Find figure\n" +
                    "4. Exit program\n" +
                    "--------------------");
            userInput = Input.nextInt();
            switch (userInput) {
                case 1 -> addFigure();
                case 2 -> printEqualsFigureByColor();
                case 3 -> findFigure();
                case 4 -> System.out.println("Exit program");
            }
        }
    }

    public void addFigure() {
//        // for test!
//        listRec.add(new Rectangle(Color.BLUE, 4, 5));
//        listRec.add(new Rectangle(Color.RED, 3, 1));
//        listRec.add(new Rectangle(Color.BLUE, 7, 2));

        System.out.println("Enter color: ");
        String userRecColor = Input.next();
        Color color = Color.colorValueOf(userRecColor);

        System.out.println("Enter a: ");
        int userRecA = Input.nextInt();

        System.out.println("Enter b: ");
        int userRecB = Input.nextInt();

        if (color != null) {
            listRec.add(new Rectangle(color, userRecA, userRecB));
            System.out.println("Figure was added!");
        } else {
            System.out.println("Цвет введен неверно!");
            addFigure();
        }
        System.out.println(listRec);
    }

    public void printEqualsFigureByColor() {
        System.out.println("Enter color");
        String userColor = Input.next();
        Color color = Color.colorValueOf(userColor);

        for (Rectangle rectangle : listRec) {
            if (rectangle.getColor().equals(color)) {
                System.out.println(rectangle);
            }
        }
    }

    public void findFigure() {
        System.out.println("Enter color");
        String userColor = Input.next();
        Color color = Color.colorValueOf(userColor);

        System.out.println("Enter a: ");
        int userRecA = Input.nextInt();

        System.out.println("Enter b: ");
        int userRecB = Input.nextInt();

        for (Rectangle rectangle : listRec) {
            if (rectangle.getColor().equals(color) && rectangle.getA() == userRecA
                    && rectangle.getB() == userRecB) {
                System.out.println("I can find figure: ");
                System.out.println(rectangle);
                return;
            }
        }
        System.out.println("I can't find figure :(");
    }
}
