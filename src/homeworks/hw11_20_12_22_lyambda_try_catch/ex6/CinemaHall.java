package homeworks.hw11_20_12_22_lyambda_try_catch.ex6;

public class CinemaHall {
     CinemaSymbol[][] cinemaArea = new CinemaSymbol[6][5];
    private CinemaSymbol[] cinemaPlace =
            {CinemaSymbol.ONE, CinemaSymbol.TWO, CinemaSymbol.THREE, CinemaSymbol.FOUR, CinemaSymbol.FIVE, CinemaSymbol.SIX};



    public CinemaHall() {
        // цифры по строкам
        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < cinemaArea.length; i++) {
                for (int j = 1; j < cinemaArea[i].length; j++) {
                    cinemaArea[0][0] = CinemaSymbol.DEFAULT;
                    if (i == 0 && j < cinemaArea.length) {
                        cinemaArea[i][j] = cinemaPlace[k];
                        k++;
                    }
                }
            }
        }

        // цифры по столбцам
        for (int k = 0; k < cinemaPlace.length; k++) {
            for (int i = 0; i < cinemaArea.length; i++) {
                for (int j = 0; j < cinemaArea[i].length; j++) {
                    if (i != 0 && i < cinemaArea.length && j == 0) {
                        cinemaArea[i][j] = cinemaPlace[k];
                        k++;
                    }
                }
            }
        }

        for (int i = 1; i < cinemaArea.length; i++) {
            for (int j = 1; j < cinemaArea[j].length; j++) {
                cinemaArea[i][j] = CinemaSymbol.EMPTY_SPACE;
            }
        }
    }

    public void showCinemaHall() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cinemaArea.length; i++) {
            for (int j = 0; j < cinemaArea[i].length; j++) {
                sb.append(cinemaArea[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
