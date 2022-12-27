package homeworks.hw11_20_12_22_lyambda_try_catch.ex5;

import input.Input;

public class ManualCar extends Car {
    public ManualCar(String name, int maxGear) {
        super(name, maxGear);
    }

    private boolean switchGear() throws InvalidGearException {
        int nextGear = Input.nextInt("Enter new gear: ");
        if (isGearValid(nextGear)) {
            setCurrentGear(nextGear);
            return true;
        }
        return false;
    }

    @Override
    public void gas() throws InvalidGearException {
        if (switchGear()) {
            System.out.println("Передача повышена");
            return;
        }
        throw new InvalidGearException("Некорректное значение");
    }

    @Override
    public void breaking() throws InvalidGearException {
        if (switchGear()) {
            System.out.println("Передача понижена");
            return;
        }
        throw new InvalidGearException("Некорректное значение");
    }
}
