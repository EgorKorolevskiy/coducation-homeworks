package homeworks.hw9_06_12_22.tic_tac;

import java.util.Random;

public class CyborgKiller extends Player {
    private Random rnd = new Random();


    public CyborgKiller(Symbol[][] gameField, Symbol symbol) {
        super(gameField, symbol);
    }

    @Override
    public void makeStep() {
        if (Game.turn % 2 == 0) {
            makeStepX();
        } else {
            makeStepO();
        }
    }

    private void makeStepX() {
        int row = rnd.nextInt(gameField.length);
        int col = rnd.nextInt(gameField.length);
        if (gameField[row][col] == Symbol.O) {
            aiCalculator(row, col);
        } else {
            System.out.println("Вражеская ячейка не найдена");
            checkEmptyCell(row, col);
            sleep();
        }
    }

    private void makeStepO() {
        int row = rnd.nextInt(gameField.length);
        int col = rnd.nextInt(gameField.length);
        if (gameField[row][col] == Symbol.X) {
            aiCalculator(row, col);
        } else {
            System.out.println("Вражеская ячейка не найдена");
            checkEmptyCell(row, col);
            sleep();
        }
    }


    private void aiCalculator(int row, int col) {
        System.out.println("Найдена вражеская ячейка! " + row + " " + col);
        int cellKiller = rnd.nextInt(0, 2);
        if (cellKiller == 0) {
            System.out.println("Повезло хожу как обычный игрок!");
            checkEmptyCell(row, col);
            sleep();
        } else if (cellKiller == 1) {
            checkEnemyCell(row, col);
            sleep();
        } else {
            System.out.println("Вражеская ячейка не найдена");
            checkEmptyCell(row, col);
            sleep();
        }
    }

    @Override
    public void checkEmptyCell(int row, int col) {
        if (gameField[row][col] == Symbol.EMPTY) {
            gameField[row][col] = symbol;
            System.out.println("Хожу на: " + row + " " + col);
        } else {
            int nextRow = rnd.nextInt(gameField.length);
            int nextCol = rnd.nextInt(gameField.length);
            checkEmptyCell(nextRow, nextCol);
        }
    }

    private void checkEnemyCell(int row, int col) {
        gameField[row][col] = symbol;
        System.out.println("Не повезло! Уничтожаю ячейку: " + row + " " + col);
    }

    private void sleep() {
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
        }
    }
}
