package homeworks.hw10_13_12_22.ex2;

public class Main {
    public static void main(String[] args) {
        ManualCar charger = new Charger("BLue Charger", 0, 6);
        ManualCar mustang = new Mustang("Black Mustang", 0, 5);
        AutoCar rio = new Rio("Red Rio", 0, 5);
        AutoCar almera = new Almera("Green ALmera", 0, 5);

//        charger.makeGas();
//        charger.makeGas();
//
//        charger.makeBreak();
//        charger.makeBreak();

//        rio.makeGas();
//        rio.makeGas();
//
//        rio.makeBreak();
//        rio.makeBreak();

        mustang.makeGas();
        mustang.makeGas();
        mustang.makeBreak();
        mustang.makeBreak();

    }
}
