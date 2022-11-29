package homeworks.hw6_15_11_22.ex4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        printCard(5);
    }

    public static void printCard(int i) {
        String cardPrint = "";

        String first = "i";
        String second = "d";
        String middle = "";

        Scanner cns = new Scanner(System.in);
        for (int j = 0; j < 3; j++) {
            middle += cns.next();
        }
        cardPrint = first + middle + second;
        char[] cArr = cardPrint.toCharArray();

        if (cArr.length == 5) {
            System.out.printf("%s%n", "Корректно");
        } else {
            System.out.printf("%s%n", "Не корректно, введите еще раз: ");
            printCard(5);
        }
    }
}

