package homeworks.hw11_20_12_22_lyambda_try_catch.ex2;

import input.Input;

public class Main {
    public static void main(String[] args) {

        int input = Input.nextInt("""
                ----
                Введите везде два числа!
                ----
                1. Найти сумму
                2. Найти разницу
                3. Найти корень
                4. Найти наибольшее
                5. Выход
                """);
        switch (input) {
            case 1 -> {
                MyFunction myFunSum = (a, b) -> a + b;
                System.out.println("Сумма двух чисел равна: ");
                System.out.println(myFunSum.doSome(Input.nextInt(), Input.nextInt()));
            }
            case 2 -> {
                MyFunction myFunSub = (a, b) -> a - b;
                System.out.println("Разница двух чисел равна: ");
                System.out.println(myFunSub.doSome(Input.nextInt(), Input.nextInt()));
            }
            case 3 -> {
                MyFunction myFunX = (a, b) -> (3-b) / a;
                System.out.println("Корень уравнения " + " a*x + b = 3" + " равен: ");
                System.out.println(myFunX.doSome(Input.nextInt(), Input.nextInt()));
            }
            case 4 -> {
                MyFunction myFunMax = (a, b) -> (Math.max(a,b));
                System.out.println("Максимум из двух чисел равно: ");
                System.out.println(myFunMax.doSome(Input.nextInt(), Input.nextInt()));
            }
        }
    }
}
