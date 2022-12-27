package homeworks.hw11_20_12_22_lyambda_try_catch.ex5;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidGearException {
        List<Car> cars = List.of(new Charger("charger1"), new Mustang("mustang1"), new Rio("rio1"), new Almera("almera1"));
        Car maxCar = null;
        for (Car car : cars) {
            if (maxCar == null || car.getMaxGear() > maxCar.getMaxGear()) {
                maxCar = car;
            }
        }
        System.out.println(maxCar);

        new Mustang("bro").gas();
    }
}
