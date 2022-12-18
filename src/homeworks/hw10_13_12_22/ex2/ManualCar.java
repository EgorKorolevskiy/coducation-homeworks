package homeworks.hw10_13_12_22.ex2;

import input.Input;

class ManualCar extends Car {

    public ManualCar(String name, int currentGear, int maxGear) {
        super(name, currentGear, maxGear);
    }

    @Override
    public void makeGas() {
        System.out.println("Введите цифру для увеличения передачи: ");
        int increaseGear = Input.nextInt();
        setCurrentGear(increaseGear);
    }

    @Override
    public void makeBreak() {
        System.out.println("Введите цифру для уменьшения передачи: ");
        int reducedGear = Input.nextInt();
        setCurrentGear(reducedGear);
    }
}

final class Charger extends ManualCar {

    public Charger(String name, int currentGear, int maxGear) {
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

final class Mustang extends ManualCar {

    public Mustang(String name, int currentGear, int maxGear) {
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
