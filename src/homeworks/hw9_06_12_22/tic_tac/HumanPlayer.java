package homeworks.hw9_06_12_22.tic_tac;

import input.Input;

import java.util.Arrays;
import java.util.InputMismatchException;

public class HumanPlayer extends Player {
    public HumanPlayer(Symbol[][] gameField, Symbol symbol) {
        super(gameField, symbol);
    }

    @Override
    public void makeStep() {
        int row;
        int col;
        boolean correct = false;
        while (!correct) {
            try {
                row = Input.nextInt("Enter row: ");
                col = Input.nextInt("Enter col: ");
                //проверка на длину массива
                if (row >= 0 && row < gameField.length && col >= 0 && col < gameField.length) {
                    correct = true;
                }

                // проверка на пустую ячейку
                checkEmptyCell(row, col);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Координаты не корректные. Повторите ввод");
            }
        }
    }

    @Override
    public void checkEmptyCell(int row, int col) {
        if (gameField[row][col] == Symbol.EMPTY) {
            gameField[row][col] = symbol;
        } else {
            System.out.println("Ячейка занята, повторите ход!");
            makeStep();
        }
    }
}
