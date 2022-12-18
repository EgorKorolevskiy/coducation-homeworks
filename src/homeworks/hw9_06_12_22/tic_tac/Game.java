package homeworks.hw9_06_12_22.tic_tac;

import input.Input;

public class Game {
    //|_||_||_|
    //|_||_||_|
    //|_||_||_|

    static int turn = 0;
    private Symbol[][] gameField = new Symbol[3][3];

    {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                gameField[i][j] = Symbol.EMPTY;
            }
        }
    }

    public void startGame() {
        System.out.println(
                "1. Классический режим\n\n" +
                        "-------------------- Режиссер Джеймс Кэмерон --------------------\n" +
                        "2. Киборг-убийца\n");
        int input = Input.nextInt();
        switch (input) {
            case 1 -> classicGame();
            case 2 -> cyborgKillerGame();
        }
    }

    private void classicGame() {
        System.out.println(
                "1. Человек VS Человек\n" +
                        "2. Человек VS Компьютер\n" +
                        "3. Компьютер VS Компьютер");
        int input = Input.nextInt();
        switch (input) {
            case 1 -> runGame(new HumanPlayer(gameField, Symbol.X), new HumanPlayer(gameField, Symbol.O));
            case 2 -> runGame(new HumanPlayer(gameField, Symbol.X), new ComputerPlayer(gameField, Symbol.O));
            case 3 -> runGame(new ComputerPlayer(gameField, Symbol.X), new ComputerPlayer(gameField, Symbol.O));
        }
    }

    private void cyborgKillerGame() {
        System.out.println(
                "1. Человек VS Киборг-убийца\n" +
                        "2. Компьютер VS Киборг-убийца\n" +
                        "3. Киборг-убийца VS Киборг-убийца\n");
        int input = Input.nextInt();
        switch (input) {
            case 1 -> runGame(new HumanPlayer(gameField, Symbol.X), new CyborgKiller(gameField, Symbol.O));
            case 2 -> runGame(new ComputerPlayer(gameField, Symbol.X), new CyborgKiller(gameField, Symbol.O));
            case 3 -> runGame(new CyborgKiller(gameField, Symbol.X), new CyborgKiller(gameField, Symbol.O));
        }
    }

    private void runGame(Player player1, Player player2) {
        Symbol winner;
        while ((winner = finish()) == null) {
            showField();
            if (turn % 2 == 0) {
                System.out.println("Ход игрока 1. Ходят " + player1.getSymbol());
                player1.makeStep();
                finish();
            } else {
                System.out.println("Ход игрока 2. Ходят " + player2.getSymbol());
                player2.makeStep();
                finish();
            }
            turn++;
        }
        printWinner(winner);
    }

    private Symbol finish() {

        // проверка по горизонту
        if (checkHorizontalWinner() != null && checkHorizontalWinner().equals(Symbol.X)) {
            return Symbol.X;
        } else if (checkHorizontalWinner() != null && checkHorizontalWinner().equals(Symbol.O)) {
            return Symbol.O;

            // проверка по вертикали
        } else if (checkVerticalWinner() != null && checkVerticalWinner().equals(Symbol.X)) {
            return Symbol.X;
        } else if (checkVerticalWinner() != null && checkVerticalWinner().equals(Symbol.O)) {
            return Symbol.O;

            // проверка по диагонали
        } else if (checkDiagonalWinner() != null && checkDiagonalWinner().equals(Symbol.X)) {
            return Symbol.X;
        } else if (checkDiagonalWinner() != null && checkDiagonalWinner().equals(Symbol.O)) {
            return Symbol.O;

            // проверка на ничью
        } else if (checkDraw() != null && checkDraw().equals(Symbol.DRAW)) {
            return Symbol.DRAW;
        }
        return null;
    }

    private Symbol checkHorizontalWinner() {
        Symbol x = Symbol.X;
        Symbol o = Symbol.O;

        if (gameField[0][0].equals(x) && gameField[0][1].equals(x) && gameField[0][2].equals(x)) {
            return x;
        } else if ((gameField[0][0].equals(o) && gameField[0][1].equals(o) && gameField[0][2].equals(o))) {
            return o;

        } else if ((gameField[1][0].equals(x) && gameField[1][1].equals(x) && gameField[1][2].equals(x))) {
            return x;
        } else if ((gameField[1][0].equals(o) && gameField[1][1].equals(o) && gameField[1][2].equals(o))) {
            return o;

        } else if ((gameField[2][0].equals(x) && gameField[2][1].equals(x) && gameField[2][2].equals(x))) {
            return x;
        } else if ((gameField[2][0].equals(o) && gameField[2][1].equals(o) && gameField[2][2].equals(o))) {
            return o;
        }
        return null;
    }

//    private Symbol checkHorizontalWinner() {
//        for (int i = 0; i < gameField.length; i++) {
//            int num = 0;
//            for (int j = 0; j < gameField[i].length; j++) {
//                if (gameField[i][0] != Symbol.EMPTY && gameField[i][0] == gameField[i][j]) {
//                    num++;
//                    if (num == 3) {
//                        return gameField[i][0];
//                    }
//                }
//            }
//        }
//        return null;
//    }

    private Symbol checkVerticalWinner() {
        Symbol x = Symbol.X;
        Symbol o = Symbol.O;

        if (gameField[0][0].equals(x) && gameField[1][0].equals(x) && gameField[2][0].equals(x)) {
            return x;
        } else if ((gameField[0][0].equals(o) && gameField[1][0].equals(o) && gameField[2][0].equals(o))) {
            return o;

        } else if ((gameField[0][1].equals(x) && gameField[1][1].equals(x) && gameField[2][1].equals(x))) {
            return x;
        } else if ((gameField[0][1].equals(o) && gameField[1][1].equals(o) && gameField[2][1].equals(o))) {
            return o;

        } else if ((gameField[0][2].equals(x) && gameField[1][2].equals(x) && gameField[2][2].equals(x))) {
            return x;
        } else if ((gameField[0][2].equals(o) && gameField[1][2].equals(o) && gameField[2][2].equals(o))) {
            return o;
        }
        return null;
    }

//    private Simbol checkVerticalWinner() {
//        for (int i = 0; i < gameField.length; i++) {
//            int num = 0;
//            int num1 = 0;
//            for (int j = 0; j < gameField[i].length; j++) {
//                if (gameField[j][i] != Simbol.EMPTY && gameField[j][i] == Simbol.X) {
//                    num++;
//                    if (num == 3) {
//                        return Simbol.X;
//                    }
//                } else if (gameField[j][i] != Simbol.EMPTY && gameField[j][i] == Simbol.O) {
//                    num1++;
//                    if (num1 == 3) {
//                        return Simbol.O;
//                    }
//                }
//
//            }
//
//        }
//        return null;
//    }



    private Symbol checkDiagonalWinner() {
        Symbol x = Symbol.X;
        Symbol o = Symbol.O;

        if (gameField[2][0].equals(x) && gameField[1][1].equals(x) && gameField[0][2].equals(x)) {
            return x;
        } else if ((gameField[2][0].equals(o) && gameField[1][1].equals(o) && gameField[0][2].equals(o))) {
            return o;

        } else if ((gameField[0][0].equals(x) && gameField[1][1].equals(x) && gameField[2][2].equals(x))) {
            return x;
        } else if ((gameField[0][0].equals(o) && gameField[1][1].equals(o) && gameField[2][2].equals(o))) {
            return o;
        }
        return null;
    }


    private Symbol checkDraw() {
        int count = 0;
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if (gameField[i][j] == Symbol.EMPTY) {
                    count++;
                }
            }
        } if (count == 0) {
            return Symbol.DRAW;
        }
        return null;
    }


    private void printWinner(Symbol winner) {
        System.out.println();
        if (winner.equals(Symbol.X)) {
            System.out.println("Результат игры: " + "\n" + "ПОБЕДА ИГРОКА 1 " + winner);
        } else if (winner.equals(Symbol.O)) {
            System.out.println("Результат игры: " + "\n" + "ПОБЕДА ИГРОКА 2 " + winner);
        } else if (winner.equals(Symbol.DRAW)) {
            System.out.println("Ничья!");
        }
        showField();
    }

    private void showField() {
        System.out.println();
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                sb.append(gameField[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
