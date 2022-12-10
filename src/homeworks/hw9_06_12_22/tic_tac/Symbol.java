package homeworks.hw9_06_12_22.tic_tac;

public enum Symbol {
    X("|X|"), O("|O|"), EMPTY("|_|"), DRAW("Ничья"), WIN("Победа");

    private String psevdo;

     Symbol(String psevdo) {
        this.psevdo = psevdo;
    }

    @Override
    public String toString() {
        return psevdo;
    }
}
