package homeworks.hw11_20_12_22_lyambda_try_catch.ex6;

public enum CinemaSymbol {
    EMPTY_SPACE("|_|"), BOOKING_SPACE("|*|"), DEFAULT("   "),
    ONE(" 1 "), TWO(" 2 "), THREE(" 3 "), FOUR(" 4 "), FIVE(" 5 "), SIX(" 6 ");

    private String psevdo;

    CinemaSymbol(String psevdo) {
        this.psevdo = psevdo;
    }

    @Override
    public String toString() {
        return this.psevdo;
    }
}
