package homeworks.hw8_29_11_22.ex2;

import java.util.Random;

public class Card {
    private int value;
    private String mast;

    public Card(int value, String mast){
        this.value = value;
        this.mast = mast;
    }

    public int getValue() {
        return value;
    }

    public String getMast() {
        return mast;
    }

    public int generateValue(int multiplier){
        return 0;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", mast='" + mast + '\'' +
                '}';
    }
}
