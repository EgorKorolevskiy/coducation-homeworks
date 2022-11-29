package homeworks.hw7_22_11_22.ex2_Sapper;

import javaRush.task6.Main;

public class Main2 {
    //card
    //|#||_||_||_||#|
    //|#||_||_||_||#|
    //|_||#||_||#||_|
    //|_||_||#||_||_|
    //|_||_||_||_||_|

    public static void main(String[] args) {
        Sapper sapper = new Sapper();
        System.out.println(sapper);
        sapper.openAllCells(0,1);
        System.out.println(sapper);
    }
}

class Sapper {
    String[][] arr;
    //константы
    final String EMPTY = "|_|";
    final String MINE = "|#|";
    final String OPENED = "|+|";
    {
        createCard();
    }

    public void createCard() {
        arr = new String[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = EMPTY;
            }
        }
        // Pзаполняем мины
        arr[0][0] = MINE;
        arr[1][0] = MINE;
        arr[2][1] = MINE;
        arr[2][3] = MINE;
        arr[3][2] = MINE;
        arr[1][4] = MINE;
        arr[0][4] = MINE;
    }

    boolean openCells = false; // true, когда открыты все ячейки

    public void openAllCells(int row, int col) {

        //если ячейка не существует, завершаем метод
        if (!isExist(row, col)) return;
        // если ячеек больше не осталось, выводим текст и делаем openCells = true;

        // костыль!
        int i = 0;
        if (isAllOpened(row, col)) {
            while (i < 5) {
                openCells = true;
                i++;
            }
            return;
        }
        // костыль!
        if (i == 5) {
            System.out.println("Ячейки заполнены");
        }

        //если ячейка не мина - завершаем метод
        if(!isEmpty(row, col)) return;

        //если же ячейка существует, она не мина и она пустая, заходим в нее и делаем посещенной
        arr[row][col] = OPENED;
        //выводим на консоль карту
        System.out.println(this);
        //смотрим влево
        openAllCells(row,col-1);
        //смотрим вверх
        openAllCells(row-1,col);
        //смотрим вправо
        openAllCells(row,col+1);
        //смотрим вниз
        openAllCells(row+1,col);
    }

    private boolean isExist(int row, int col) {
        return row >= 0 && row < arr.length && col >= 0 && col <arr[row].length;
    }

    private boolean isAllOpened(int row, int col) {
        return arr[row][col].equals(OPENED);
    }

    private boolean isEmpty(int row, int col) {
        return arr[row][col].equals(EMPTY) || arr[row][col].equals(OPENED);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
