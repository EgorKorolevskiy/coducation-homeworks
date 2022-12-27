package homeworks.hw11_20_12_22_lyambda_try_catch.ex5;

public class AutoCar extends Car {
    public AutoCar(String name, int maxGear) {
        super(name, maxGear);
    }

    @Override
    public void gas() {
        int nextGear = getCurrentGear() + 1;
        if (isGearValid(nextGear)) {
            setCurrentGear(nextGear);
            System.out.println("Передача повышена");
            return;
        }
        System.out.println("Вы на максимальной передаче");
    }

    @Override
    public void breaking() {
        int nextGear = getCurrentGear() - 1;
        if (isGearValid(nextGear)) {
            setCurrentGear(nextGear);
            System.out.println("Передача понижена");
            return;
        }
        System.out.println("вы на минимальной передаче");
    }
}
