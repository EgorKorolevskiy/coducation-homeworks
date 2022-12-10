package homeworks.hw9_06_12_22.tic_tac;

public class Main {
    /**
     * Создать каркас игры крестии-нолики с тремя режимами:
     * <ol>
     *      <li> Человек vs Человек </li>
     *      <li> Человек vs Компьютер </li>
     *      <li> Компьютер vs Компьютер </li>
     * </ol>
     * В игре должны быт реализованы проверки:
     * <ol>
     *      <li> проверка на занятую ячейку </li>
     *      <li> проверка на вводт правильных координат (которые не выходят за пределы игрового поля) </li>
     *      <li> проверка на победителя и ничью </li>
     * </ol>
     * <p>
     * <h1>Домашка</h1>
     * </p>

     * - Доделать необходимые проверки. Добавить режим ComputerKiller, который может сходить,
     * а может и отменить один из ходов соперника (очистить ячейку).
     * Оба действия имеют вероятность 50%, но выполняется только одно.
     *
     * ComputerKiller должен сначала проверить, есть ли на доске клетка соперника.
     * 1. Если есть, он бросает монетку (рандом от 0 до 1 включительно)
     * Если выпал 0, к примеру, computer ищет свободную ячейку и ставит туда свой символ
     * Если выпала 1, computer ищет клетку соперника и ставит вместо нее свой символ.
     * 2. Если нет, computer ищет только пустую клетку и ставит туда свой символ
     *
     * Поиск подразумевает цикл, работающий до тех пор, пока не будет найдена подходящая ячейка
     *
     * @param args
     */


    public static void main(String[] args) {
        new Game().startGame();
    }
}
