package homeworks.hw8_29_11_22.ex2;

public class SmartCard extends Card{
    public SmartCard(int value, String mast) {
        super(value, mast);
    }


    @Override
    public int generateValue(int multiplier) {
        super.generateValue(multiplier);
        if (multiplier == 1) {
            return getValue();
        } else if (multiplier == 2) {
            return getValue() * 2;
        } else if (multiplier == 3 && getMast().equals("Пики")) {
            return getValue() * 3;
        } else if (multiplier == 4 && !getMast().equals("Пики")
                                   && !getMast().equals("Крести")) {
            return getValue() * 4;
        }
        return 0;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
