package homeworks.hw10_13_12_22.ex3;

import input.Input;

class ConsoleGenerator implements IntGenerator {

    @Override
    public int getInt() {
        System.out.println("Введите число: ");
        return Input.nextInt();
    }
}
