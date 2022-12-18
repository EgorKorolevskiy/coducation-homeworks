package homeworks.hw10_13_12_22.ex3;

import java.util.Random;

class RandomGenerator implements IntGenerator {

    @Override
    public int getInt() {
        Random rnd = new Random();
        return rnd.nextInt(10);
    }
}
