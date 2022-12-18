package homeworks.hw10_13_12_22.ex2;

public abstract class Car {
   private String name;
   private int currentGear;
   private int maxGear;

    public Car(String name, int currentGear, int maxGear) {
        this.name = name;
        this.currentGear = currentGear;
        this.maxGear = maxGear;
    }

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

   public abstract void makeGas();

   public abstract void makeBreak();
}

