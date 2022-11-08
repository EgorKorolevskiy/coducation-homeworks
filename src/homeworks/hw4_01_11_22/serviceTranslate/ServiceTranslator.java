package homeworks.hw4_01_11_22.serviceTranslate;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ServiceTranslator {
    private Scanner cns = new Scanner(System.in);

    // List of all english words
    private ArrayList<String> wordsList = new ArrayList<>();

    // List of all english words
    private ArrayList<String> notStudiedWords = new ArrayList<>();

    // list of translate words
    private ArrayList<String> translateList = new ArrayList<>();

    // list of user's attempts
    private ArrayList<Integer> userCount = new ArrayList<>();

    // list of user's not rights attempts
    private ArrayList<Integer> userNotRightCount = new ArrayList<>();

    public void startService() {
        int inputUser = 0;
        while (inputUser != 6) {
            System.out.println("--------------------\n" +
                    "1. Add new english word with translate\n" +
                    "2. Repeat learned words \n" +
                    "3. Learned new words\n" +
                    "4. Display word statistics\n" +
                    "5. Test\n" +
                    "6. Exit program\n" +
                    "--------------------");
            try {
                inputUser = cns.nextInt();
                switch (inputUser) {
                    case 1 -> serviceOne();
                    case 2 -> serviceTwo();
                    case 3 -> serviceThree();
                    case 4 -> serviceFour();
                    case 5 -> test();
                    case 6 -> System.out.println("Exit program");
                }
            } catch (InputMismatchException e) {
                System.out.println("No such answer");
            }
        }
    }

    public void serviceOne() {
        NewWords newWords = new NewWords("", "");
        System.out.println("Enter new word: ");
        String word = cns.next();
        newWords.setWord(word);
        wordsList.add(newWords.getWord());

        // for tests!
//        wordsList.add("Hello");
//        wordsList.add("Bye");
//        wordsList.add("Car");
//        wordsList.add("Plane");
//        wordsList.add("Computer");

        System.out.println("Enter translate this word: ");

        String word2 = cns.next();
        newWords.setTranslateWord(word2);
        translateList.add(newWords.getTranslateWord());
        userCount.add(0);
        userNotRightCount.add(0);

        // for tests!
//        translateList.add("Privet");
//        translateList.add("Poka");
//        translateList.add("Mashina");
//        translateList.add("Samolet");
//        translateList.add("Komputer");

        // for tests!
//        userCount.add(1);
//        userCount.add(1);
//        userCount.add(5);
//        userCount.add(1);
//        userCount.add(1);

        // for tests!
//        userNotRightCount.add(0);
//        userNotRightCount.add(4);
//        userNotRightCount.add(3);
//        userNotRightCount.add(2);
//        userNotRightCount.add(5);

        System.out.println("Would u like to add another word? y/n: ");
        String usInput = cns.next();
        if (usInput.equals("y")) {
            serviceOne();
        } else {
            startService();
        }
    }

    public void serviceTwo() {
        Random rnd = new Random();

        int count = 1;
        while (count != 10) {

            String randomWord = wordsList.get(rnd.nextInt(wordsList.size())); // выводит рандомное слово
            int indexRandomWord = wordsList.indexOf(randomWord); // ищет индекс рандомного слова
            System.out.println("Enter translate this word: " + randomWord);

            String userTranslate = cns.next();
            for (int i = 0; i < translateList.size(); i++) {
                if (userTranslate.equals(translateList.get(i))) {
                    System.out.println("Find right translate +1 point!");
                    userCount.set(indexRandomWord, userCount.get(indexRandomWord) + 1);
                    break;
                } else if (i != indexRandomWord) {
                    continue;
                } else {
                    System.out.println("Not find right translate, u have total 0 point");
                    userCount.set(indexRandomWord, 0);
                    userNotRightCount.set(indexRandomWord, userNotRightCount.get(indexRandomWord) +1);
                }
            }
            count++;

            // for tests!
            System.out.println(wordsList);
            System.out.println(translateList);
            System.out.println(userCount);
        }
    }

    public void serviceThree() {
        Random rnd = new Random();


        for (int i = 0; i < wordsList.size(); i++) {
            if (userCount.get(i) < 5) {
                notStudiedWords.add(wordsList.get(i));
            } else if (userCount.get(i) >= 5) {
                notStudiedWords.add("");
            }
        }

        int count = 1;
        while (count != 10) {

            String randomWord = notStudiedWords.get(rnd.nextInt(notStudiedWords.size())); // выводит рандомное слово

            if (randomWord.length() >= 1) {
                int indexRandomWord = notStudiedWords.indexOf(randomWord); // ищет индекс рандомного слова
                System.out.println("Enter translate this word: " + randomWord);

                String userTranslate = cns.next();
                for (int i = 0; i < translateList.size(); i++) {
                    if (userTranslate.equals(translateList.get(i))) {
                        System.out.println("Find right translate +1 point!");
                        userCount.set(indexRandomWord, userCount.get(indexRandomWord) + 1);
                        break;
                    } else if (i != indexRandomWord) {
                        continue;
                    } else {
                        System.out.println("Not find right translate, u have total 0 point");
                        userCount.set(indexRandomWord, 0);
                        userNotRightCount.set(indexRandomWord, userNotRightCount.get(indexRandomWord) +1);
                    }
                }
                System.out.println(notStudiedWords);
                System.out.println(translateList);
                System.out.println(userCount);
                count++;
            } else {
                continue;
            }
        }
    }

    public void serviceFour() {
        for (int i = 0; i < wordsList.size(); i++) {
            if (userNotRightCount.get(i) == 0 ) {
                System.out.println("Процент правильных ответов для слова: " + wordsList.get(i) + " = " + 100);
            } else {
                int a = userCount.get(i);
                int b = userNotRightCount.get(i);
                double d = a + b;
                double c = (a / d) * 100;
                System.out.println("Процент правильных ответов для слова: " + wordsList.get(i) + " = " + c);
            }
        }
    }

    public void test() {
        System.out.println(wordsList + "\n" + translateList + "\n" + userCount);
    }
}
