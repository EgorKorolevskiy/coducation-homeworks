package homeworks.hw9_06_12_22.tic_tac;

import java.util.Random;

public class ComputerPlayer extends Player {
    private Random rnd = new Random();

    public ComputerPlayer(Symbol[][] gameField, Symbol symbol) {
        super(gameField, symbol);
    }

    @Override
    public void makeStep() {
        int row = rnd.nextInt(gameField.length);
        int col = rnd.nextInt(gameField.length);

        // проверка на пустую ячейку
        checkEmptyCell(row, col);
        try {
            Thread.sleep(1500);
        } catch (Exception e) {}
    }

    @Override
    public void checkEmptyCell(int row, int col) {
        if (gameField[row][col] == Symbol.EMPTY) {
            gameField[row][col] = symbol;
        } else {
            int nextRow = rnd.nextInt(gameField.length);
            int nextCol = rnd.nextInt(gameField.length);
            checkEmptyCell(nextRow, nextCol);
        }
    }
}
