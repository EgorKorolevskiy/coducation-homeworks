package homeworks.hw8_29_11_22.ex2;

import input.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static List<Card> listCard = new ArrayList<>();

    public static void main(String[] args) {
        listCard.add(new SmartCard(rndValue(), rndMast()));
        listCard.add(new SillyCard(rndValue(), rndMast()));
        listCard.add(new SmartCard(rndValue(), rndMast()));
        listCard.add(new SillyCard(rndValue(), rndMast()));
        listCard.add(new SmartCard(rndValue(), rndMast()));
        listCard.add(new SillyCard(rndValue(), rndMast()));

        for (Card card : listCard) {
            System.out.println(card);
        }
        System.out.println();

        startGame();
    }

    public static void startGame() {
        int player1 = 0;
        int player2 = 0;
        int countRound = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Раунд " + countRound + " из 5");
            ++countRound;

            System.out.println("Игрок 1 введите номер карты: ");
            int player1Index = Input.nextInt();
            Card a = listCard.get(player1Index);
            int powerPlayer1 = a.generateValue(a.getValue());

            System.out.println("Игрок 2 введите номер карты: ");
            int player2Index = Input.nextInt();
            Card b = listCard.get(player2Index);
            int powerPlayer2 = b.generateValue(b.getValue());

            // вывод инфы о игроке 1
            System.out.println(player1Index + ":" + a +  "," + " сила: " + powerPlayer1);
            // вывод инфы о игроке 2
            System.out.println(player2Index + ":" + a +  "," + " сила: " + powerPlayer2);

            if (powerPlayer1 > powerPlayer2) {
                ++player1;
            } else if (powerPlayer2 > powerPlayer1) {
                ++player2;
            } else
                return;
        }
        System.out.println("Кол-во побед первого  игрока: " + player1);
        System.out.println("Кол-во побед второго  игрока: " + player2);
    }

    public static String rndMast() {
        Random rnd = new Random();
        String rndMast = "";
        String[] arr = {"Пики", "Черви", "Крести", "Бубны"};
        for (int i = 0; i < arr.length; i++) {
            int indexMast = rnd.nextInt(arr.length);
            rndMast = arr[indexMast];

        }
        return rndMast;
    }

    public static int rndValue() {
        Random rnd = new Random();
        return rnd.nextInt(1, 5);
    }

    @Override
    public String toString() {

        return super.toString();
    }
}
