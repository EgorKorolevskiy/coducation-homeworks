package homeworks.hw8_29_11_22.ex2;

public class SillyCard extends Card{
    public SillyCard(int value, String mast) {
        super(value, mast);
    }

    @Override
    public int generateValue(int multiplier) {
        super.generateValue(multiplier);
        if (multiplier == 1) {
            return getValue() * 4;
        } else if (multiplier == 2) {
            return getValue() - 1;
        } else if (multiplier == 3 && getMast().equals("Пики")) {
            return getValue() - 2;
        } else if (multiplier == 4 && !getMast().equals("Пики")
                                   && !getMast().equals("Крести")) {
            return getValue() * 2;
        }
        return 0;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
