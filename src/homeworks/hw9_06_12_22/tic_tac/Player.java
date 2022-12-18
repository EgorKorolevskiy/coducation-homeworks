package homeworks.hw9_06_12_22.tic_tac;

public abstract class Player {
    Symbol[][] gameField;
    Symbol symbol;

    public Player(Symbol[][] gameField, Symbol symbol) {
        this.gameField = gameField;
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public abstract void makeStep();

    public void checkEmptyCell(int row, int col) {

    }
}
