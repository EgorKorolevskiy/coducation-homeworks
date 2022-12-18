package homeworks.hw10_13_12_22.ex3;

public class Main {
    public static void main(String[] args) {

        Service consoleService = new Service(new ConsoleGenerator());
        Service randomService = new Service(new RandomGenerator());

        int a = consoleService.readInt();
        System.out.println("Генерация числа через консоль - " + a);
        int b = randomService.readInt();
        System.out.println("Генерация числа через рандом - " + b);

        int c = a + b;

        System.out.println("Сумма - " + c);
    }
}
