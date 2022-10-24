package homeworks.hw2_18_10_22;

import java.util.*;

/**
 * Задача 3 В задаче представлены только базовые требования. Можно дописывать свой код.
 * <p>
 * Создать класс Card со значением
 * масть карты (виды масти: Черви, Пики)
 * значение карты (целое число от 1 до 5 включительно)
 * <p>
 * Создайте класс Deck (колода) с массивом на 10 элементов типа Card.
 * В данной задаче будем считать, что колода состоит из 10-и карт, где каждая карта имеет две масти.
 * Карты из колодцы:
 * Ч 1, П1 (черви 1, пики 1)
 * Ч 2, П 2
 * Ч 3, П 3
 * Ч 4, П 4
 * Ч 5, П 5
 * <p>
 * В мейне создайте консольное меню:
 * 1. Добавить карту (юзер вводит с консоли масть и значение)
 * 2. Выход
 * <p>
 * Задача юзера  - собрать колоду из карт. При выборе первого пункта юзер вводит масть добавляемой карты и ее значение.
 * Программа должна сначала проверить, что такой карты еще нет в колоде и только потом добавить ее.
 * Когда юзер соберет все карты, программа должна вывести на консоль "Колода собрана!" И вывести все карты
 * <p>
 * <p>
 * Генерируйте значения и масти реальных карт.
 * Возможные значения: 6 7 8 9 10 J Q K A
 * Возможные масти: черви, пики, крести, буби (или по английски можно)
 */

public class Card {
    // поле масти пик (символ пики в строковом виде)
    private String suitCardSpades;

    // поле масти червей (символ червей в строковом виде)
    private String suitCardHearts;

    // поле масти крестей
    private String suitCardClubs;

    // поле масти бубей
    private String suitCardDiamonds;

    // поле порядкового номера карты
    private int sequenceCardNum;

    // поле номинала карты (6, 7, ... A)
    private String nominalCard;

    // поле итогового микса. Пока оставлю
    private String mixCardsDeck;

    public Card(String suitCardSpades, String suitCardHearts, String suitCardClubs, String suitCardDiamonds, int sequenceCardNum, String nominalCard, String mixCardsDeck) {
        this.suitCardSpades = suitCardSpades;
        this.suitCardHearts = suitCardHearts;
        this.suitCardClubs = suitCardClubs;
        this.suitCardDiamonds = suitCardDiamonds;
        this.sequenceCardNum = sequenceCardNum;
        this.nominalCard = nominalCard;
        this.mixCardsDeck = mixCardsDeck;
    }

    public String getSuitCardSpades() {
        return suitCardSpades;
    }

    public void setSuitCardSpades(String suitCardSpades) {
        this.suitCardSpades = suitCardSpades;
    }

    public String getSuitCardHearts() {
        return suitCardHearts;
    }

    public void setSuitCardHearts(String suitCardHearts) {
        this.suitCardHearts = suitCardHearts;
    }

    public String getSuitCardClubs() {
        return suitCardClubs;
    }

    public void setSuitCardClubs(String suitCardClubs) {
        this.suitCardClubs = suitCardClubs;
    }

    public String getSuitCardDiamonds() {
        return suitCardDiamonds;
    }

    public void setSuitCardDiamonds(String suitCardDiamonds) {
        this.suitCardDiamonds = suitCardDiamonds;
    }

    public int getSequenceCardNum() {
        return sequenceCardNum;
    }

    public void setSequenceCardNum(int sequenceCardNum) {
        this.sequenceCardNum = sequenceCardNum;
    }

    public String getNominalCard() {
        return nominalCard;
    }

    public void setNominalCard(String nominalCard) {
        this.nominalCard = nominalCard;
    }

    public String getMixCardsDeck() {
        return mixCardsDeck;
    }

    public void setMixCardsDeck(String mixCardsDeck) {
        this.mixCardsDeck = mixCardsDeck;
    }

    // метод выводит на экран любую колоду
    public void printInfoDeck() {
        System.out.println("Карта: " + "(" + getSequenceCardNum() + ")" + " " + getNominalCard() + getSuitCardSpades() + getSuitCardHearts() +
                getSuitCardClubs() + getSuitCardDiamonds() + getMixCardsDeck());
    }
}

class Deck {
    private Card card;

    public Deck(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    // перемешанная колода крупье
    Card[] arrMixDeck = new Card[36];

    // колода Юзера (в процессе). Сделал на 3 элемента, что бы тестить было легче!
    Card[] arrUserDeck = new Card[7];

    // колода пик
    Card[] arrDeckSpades = new Card[9];

    // колода червей
    Card[] arrDeckHearts = new Card[9];

    // колода крестей
    Card[] arrDeckClubs = new Card[9];

    // колода бубен
    Card[] arrDeckDiamonds = new Card[9];

    // массив с дефолтными значениями и мастями
    String[] suitsNum = {"6", "7", "8", "9", "10", "J", "Q", "K", "A"};


    // создание колоды пик
    public Card[] createArrDeckSpades() {
        Collections.shuffle(Arrays.asList(suitsNum));
        System.out.println("Колода пик");
        for (int i = 0; i < arrDeckSpades.length; i++) {
            Card card1 = new Card("", "", "", "", 1, "", "");
            card1.setSequenceCardNum(i + 1);
            card1.setNominalCard(suitsNum[i]);
            card1.setSuitCardSpades("" + '\u2660');
            arrDeckSpades[i] = card1;
        }
        return arrDeckSpades;
    }

    // создание колоды червей
    public Card[] createDeckHearts() {
        Collections.shuffle(Arrays.asList(suitsNum));
        System.out.println("Колода червей");
        for (int i = 0; i < arrDeckHearts.length; i++) {
            Card card1 = new Card("", "", "", "", 1, "", "");
            card1.setSequenceCardNum(i + 1);
            card1.setNominalCard(suitsNum[i]);
            card1.setSuitCardHearts("" + '\u2665');
            arrDeckHearts[i] = card1;
        }
        return arrDeckHearts;
    }

    // создание колоды крестей
    public Card[] createDeckClubs() {
        Collections.shuffle(Arrays.asList(suitsNum));
        System.out.println("Колода крестей");
        for (int i = 0; i < arrDeckClubs.length; i++) {
            Card card1 = new Card("", "", "", "", 1, "", "");
            card1.setSequenceCardNum(i + 1);
            card1.setNominalCard(suitsNum[i]);
            card1.setSuitCardClubs("" + '\u2663');
            arrDeckClubs[i] = card1;
        }
        return arrDeckClubs;
    }

    // создание колоды бубен
    public Card[] createDeckDiamonds() {
        Collections.shuffle(Arrays.asList(suitsNum));
        System.out.println("Колода бубен");
        for (int i = 0; i < arrDeckDiamonds.length; i++) {
            Card card1 = new Card("", "", "", "", 1, "", "");
            card1.setSequenceCardNum(i + 1);
            card1.setNominalCard(suitsNum[i]);
            card1.setSuitCardDiamonds("" + '\u2666');
            arrDeckDiamonds[i] = card1;
        }
        return arrDeckDiamonds;
    }

    // создание колоды крупье
    public Card[] createMixArr() {

        // создаем колоду крупье
        //добавляем в пустой массив arrMixDeck (наша будущая колода крупье) массив пик
//        System.out.println("Колода крупье");
        for (int i = 0; i < 9; i++) {
            Card card1 = new Card("", "", "", "", 1, "", "");
            card1.setSequenceCardNum(i + 1);
            Card arrSpades = arrDeckSpades[i];
            card1.setNominalCard(arrSpades.getNominalCard());
            card1.setSuitCardSpades(arrSpades.getSuitCardSpades());
            arrMixDeck[i] = card1;
        }

        //добавляем в массиве arrMixDeck находится массив пик. Добавляем к нему следующую колоду червей
        int h = 0;
        for (int i = 9; i < 18; i++) {
            Card card1 = new Card("", "", "", "", 1, "", "");
            card1.setSequenceCardNum(i + 1);
            Card arrHearts = arrDeckHearts[h];
            card1.setNominalCard(arrHearts.getNominalCard());
            card1.setSuitCardHearts(arrHearts.getSuitCardHearts());
            arrMixDeck[i] = card1;
            h++;
        }

        // + еще колода - крести
        int c = 0;
        for (int i = 18; i < 27; i++) {
            Card card1 = new Card("", "", "", "", 1, "", "");
            card1.setSequenceCardNum(i + 1);
            Card arrClubs = arrDeckClubs[c];
            card1.setNominalCard(arrClubs.getNominalCard());
            card1.setSuitCardClubs(arrClubs.getSuitCardClubs());
            arrMixDeck[i] = card1;
            c++;
        }

        // и еще колода - бубен
        int d = 0;
        for (int i = 27; i < 36; i++) {
            Card card1 = new Card("", "", "", "", 1, "", "");
            card1.setSequenceCardNum(i + 1);
            Card arrDiamonds = arrDeckDiamonds[d];
            card1.setNominalCard(arrDiamonds.getNominalCard());
            card1.setSuitCardDiamonds(arrDiamonds.getSuitCardDiamonds());
            arrMixDeck[i] = card1;
            d++;
        }

        // теперь у нас колода вида: карта (1) пика, карта (2) пика.... карта 10(черви) 11(черви)....

        // Сделаем так, что порядковый номер карты в колоде сохранится, но изменится масть и номинал карты!

        Collections.shuffle(Arrays.asList(arrMixDeck));
        for (int i = 0; i < arrMixDeck.length; i++) {
            Card card1 = new Card("", "", "", "", 1, "", "");
            card1.setSequenceCardNum(i + 1);
            Card arrMix = arrMixDeck[i];
            card1.setNominalCard(arrMix.getNominalCard());
            card1.setSuitCardSpades(arrMix.getSuitCardSpades());
            card1.setSuitCardHearts(arrMix.getSuitCardHearts());
            card1.setSuitCardClubs(arrMix.getSuitCardClubs());
            card1.setSuitCardDiamonds(arrMix.getSuitCardDiamonds());
            arrMixDeck[i] = card1;
        }
        return arrMixDeck;
    }

    // cчитываем от юзера номинал карты
    public String userInputNominalCard() {
        Scanner cns = new Scanner(System.in);

        System.out.println("Введи значение карты карты - 6, 7 ,8 ,9, 10, J, Q, K, A");
        String userNominalCard = cns.next();
        return userNominalCard;
    }

    // считываем от юзера масть карты
    public String userInputSuitCard() {
        Scanner cns = new Scanner(System.in);

        System.out.println("Введи масть карты (пики, черви, крести, бубны)");
        String userInputSuit = cns.next();

//        "пики";
        String userSuitSpades = "\u2660";

//        "черви";
        String userSuitHearts = "\u2665";

//        "крести";
        String userSuitClubs = "\u2663";

//        "бубны";
        String userSuitDiamonds = "\u2666";

        if (userInputSuit.equals("пики")) {
            userInputSuit = userSuitSpades;
        } else if (userInputSuit.equals("черви")) {
            userInputSuit = userSuitHearts;
        } else if (userInputSuit.equals("крести")) {
            userInputSuit = userSuitClubs;
        } else if (userInputSuit.equals("бубны")) {
            userInputSuit = userSuitDiamonds;
        }
        return userInputSuit;
    }

    // проверка на то, есть ли в колоде юзера карта такой же масти и такого же номинала
    public void checkUniqueCard(String userNominalCard, String userInputSuit, int index) {
        for (int i = 0; i < arrUserDeck.length; i++) {
            if (arrUserDeck[i] == null) {
                createUserDeck(userNominalCard, userInputSuit, index);
                break;
            } else if (userNominalCard.equals(arrUserDeck[i].getNominalCard()) && userInputSuit.equals(arrUserDeck[i].getSuitCardSpades())) {
                System.out.println("Такая пиковая карта уже есть!");
                break;
            } else if (userNominalCard.equals(arrUserDeck[i].getNominalCard()) && userInputSuit.equals(arrUserDeck[i].getSuitCardHearts())) {
                System.out.println("Такая червовая карта уже есть!");
                break;
            } else if (userNominalCard.equals(arrUserDeck[i].getNominalCard()) && userInputSuit.equals(arrUserDeck[i].getSuitCardClubs())) {
                System.out.println("Такая крестовая карта уже есть!");
                break;
            } else if (userNominalCard.equals(arrUserDeck[i].getNominalCard()) && userInputSuit.equals(arrUserDeck[i].getSuitCardDiamonds())) {
                System.out.println("Такая бубновая карта уже есть!");
                break;
            }
        }
    }

    // Создание колоды юзера
    public Card[] createUserDeck(String userNominalCard, String userInputSuit, int index) {

        for (Card value : arrMixDeck) {
            Card card1 = new Card("", "", "", "", 1, "", "");

            // Если юзер хочет добавить пики в свою колоду, то ищем в колоде крупье нашу карту пики
            // ищем объект с параметрами от юзера в колоде крупье
            if (userNominalCard.equals(value.getNominalCard()) && userInputSuit.equals(value.getSuitCardSpades())) {
                // добавляем объект пик в нашу колоду юзера
                card1.setSequenceCardNum(index + 1);
                card1.setNominalCard(value.getNominalCard());
                card1.setSuitCardSpades(value.getSuitCardSpades());
                arrUserDeck[index] = card1;
                index++;

                // если юзер хочет добавить червей
                // добавляем объект червей в нашу колоду юзера
            } else if (userNominalCard.equals(value.getNominalCard()) && userInputSuit.equals(value.getSuitCardHearts())) {
                card1.setSequenceCardNum(index + 1);
                card1.setNominalCard(value.getNominalCard());
                card1.setSuitCardHearts(value.getSuitCardHearts());
                arrUserDeck[index] = card1;
                index++;

                // если юзер хочет добавить крести
                // добавляем объект червей в нашу колоду юзера
            } else if (userNominalCard.equals(value.getNominalCard()) && userInputSuit.equals(value.getSuitCardClubs())) {
                card1.setSequenceCardNum(index + 1);
                card1.setNominalCard(value.getNominalCard());
                card1.setSuitCardClubs(value.getSuitCardClubs());
                arrUserDeck[index] = card1;
                index++;

                // если юзер хочет добавить бубны
                // добавляем объект червей в нашу колоду юзера
            } else if (userNominalCard.equals(value.getNominalCard()) && userInputSuit.equals(value.getSuitCardDiamonds())) {
                card1.setSequenceCardNum(index + 1);
                card1.setNominalCard(value.getNominalCard());
                card1.setSuitCardDiamonds(value.getSuitCardDiamonds());
                arrUserDeck[index] = card1;
                index++;
            }
        }
        return arrUserDeck;
    }
}


class Main3 {
    public static void main(String[] args) {
        CreateDeck createDeck = new CreateDeck();
        createDeck.startBuildDeck();
    }
}

class CreateDeck {
    public void startBuildDeck() {
        Card card = new Card("", "", "", "", 1, "", "");
        Deck deck = new Deck(card);

        showCasinoMenu();
        selectCasinoMenu(deck);
    }

    public void showCasinoMenu() {
        System.out.println("""
                --------------------
                1. Достать каждую колоду из своей упаковки
                2. Пусть крупье перемешает колоды!
                3. Вывести колоду крупье (не подглядывай, это читы уже!)
                4. Добавить карту в свою колоду (10 карт в руке)
                5. Показать свою колоду!
                6. Выход
                --------------------""");
    }

    public void selectCasinoMenu(Deck deck) {
        Scanner cns = new Scanner(System.in);
        try {
            int inputUserNum = cns.nextInt();
            switch (inputUserNum) {
                case (1) -> printMenu1(deck);
                case (2) -> printMenu2(deck);
                case (3) -> printMenu3(deck);
                case (4) -> printMenu4(deck);
                case (5) -> printMenu5(deck);
                case (6) -> System.out.println("Выход из казино 1kBet");
                default -> System.out.println("Нет такого варианта ответа!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Нет такого пункта меню!");
        }
    }

    // вывод всех колод карт всех мастей, в изначальном виде
    public void printMenu1(Deck deck) {
        deck.createArrDeckSpades();
        for (Card arrCardsSpade : deck.arrDeckSpades) {
            arrCardsSpade.printInfoDeck();
        }

        System.out.println();

        deck.createDeckHearts();
        for (Card arrDeckHeart : deck.arrDeckHearts) {
            arrDeckHeart.printInfoDeck();
        }

        System.out.println();

        deck.createDeckClubs();
        for (Card arrDeckClub : deck.arrDeckClubs) {
            arrDeckClub.printInfoDeck();
        }

        System.out.println();

        deck.createDeckDiamonds();
        for (Card arrDeckDiamond : deck.arrDeckDiamonds) {
            arrDeckDiamond.printInfoDeck();
        }
        showCasinoMenu();
        selectCasinoMenu(deck);
    }

    // вызов метода deck.createMixArr(); - который собирает колоду крупье и мешает ее в случайно порядке
    public void printMenu2(Deck deck) {
        deck.createMixArr();
        System.out.println("Крупье перемешал колоду!");
        showCasinoMenu();
        selectCasinoMenu(deck);
    }

    // показать колоду крупье
    public void printMenu3(Deck deck) {
        for (Card card : deck.arrMixDeck) {
            card.printInfoDeck();
        }
        showCasinoMenu();
        selectCasinoMenu(deck);
    }


    public void printMenu4(Deck deck) {
        // цикл по массиву колоды юзера
        for (int i = 0; i < deck.arrUserDeck.length; i++) {
            int index = i;
            // если индекс нул
            if (deck.arrUserDeck[i] == null) {
                // передаем то, что ввел юзер в методы (происходит обработка и возврат значений ((String a), (String b)))
                String a = deck.userInputNominalCard();
                String b = deck.userInputSuitCard();
                // вызываем метод, и передаем туда значения бзера
                deck.checkUniqueCard(a, b, index);
                // условие ниже проверяет, если все равно нул, то производим рекурсию и вызываем метод еще раз
            } if (deck.arrUserDeck[i] == null) {
                printMenu4(deck);
            }
        }
        System.out.println("Колода собрана!");
        showCasinoMenu();
        selectCasinoMenu(deck);
    }

    public void printMenu5(Deck deck) {
        System.out.println("Твоя колода");
        for (Card card1 : deck.arrUserDeck) {
            card1.printInfoDeck();
        }
        showCasinoMenu();
        selectCasinoMenu(deck);
    }
}
