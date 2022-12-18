package homeworks.hw10_13_12_22.ex2;

class AutoCar extends Car {

    public AutoCar(String name, int currentGear, int maxGear) {
        super(name, currentGear, maxGear);
    }

    @Override
    public void makeGas() {
        int a = getCurrentGear();
        setCurrentGear(++a);
        System.out.printf("Сделали газ. АКП повысила передачу. Новая передача - %s%n ", getCurrentGear());
    }

    @Override
    public void makeBreak() {
        int b = getCurrentGear();
        setCurrentGear(--b);
        System.out.printf("Затормозили. АКП снизила передачу. Новая передача - %s%n ", getCurrentGear());
    }
}

final class Rio extends AutoCar {

    public Rio(String name, int currentGear, int maxGear) {
        super(name, currentGear, maxGear);
    }

    @Override
    public void makeGas() {
        System.out.println("Текущая передача: " + getCurrentGear());
        super.makeGas();
        if (getCurrentGear() <= getMaxGear()) {
            return;
        }
        System.out.printf("Передача не может быть больше %s. Повторите попытку%n", getMaxGear());
        super.makeGas();
    }

    @Override
    public void makeBreak() {
        System.out.println("Текущая передача: " + getCurrentGear());
        super.makeBreak();
        if (getCurrentGear() >= 0) {
            return;
        }
        System.out.printf("Передача не может быть меньше 0. Повторите попытку%n");
        super.makeBreak();
    }
}

final class Almera extends AutoCar {

    public Almera(String name, int currentGear, int maxGear) {
        super(name, currentGear, maxGear);
    }

    @Override
    public void makeGas() {
        System.out.println("Текущая передача: " + getCurrentGear());
        super.makeGas();
        if (getCurrentGear() <= getMaxGear()) {
            return;
        }
        System.out.printf("Передача не может быть больше %s. Повторите попытку%n", getMaxGear());
        super.makeGas();
    }

    @Override
    public void makeBreak() {
        System.out.println("Текущая передача: " + getCurrentGear());
        super.makeBreak();
        if (getCurrentGear() >= 0) {
            return;
        }
        System.out.printf("Передача не может быть меньше 0. Повторите попытку%n");
        super.makeBreak();
    }
}
