package homeworks.hw11_20_12_22_lyambda_try_catch.ex5;

abstract class Car {
    private String name;
    private int currentGear;
    private int maxGear;

    public Car(String name, int maxGear) {
        this.name = name;
        this.maxGear = maxGear;
    }

    public abstract void gas() throws InvalidGearException;

    public abstract void breaking() throws InvalidGearException;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getMaxGear() {
        return maxGear;
    }

    public void setMaxGear(int maxGear) {
        this.maxGear = maxGear;
    }

    public boolean isGearValid(int gear) {
        return gear >= 0 && gear <= getMaxGear();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", currentGear=" + currentGear +
                ", maxGear=" + maxGear +
                '}';
    }
}
