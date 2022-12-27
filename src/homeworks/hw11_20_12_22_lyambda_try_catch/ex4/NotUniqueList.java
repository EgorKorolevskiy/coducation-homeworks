package homeworks.hw11_20_12_22_lyambda_try_catch.ex4;

import java.util.ArrayList;
import java.util.List;

public class NotUniqueList implements MyList {
    List<Integer> notUniqueList = new ArrayList<>();

    @Override
    public void add(int val) {
        notUniqueList.add(val);
    }

    @Override
    public int get(int index) {
        try {
            return notUniqueList.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Индекс не найден!");
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int size() {
        return notUniqueList.size();
    }

    @Override
    public boolean contains(int val) {
        return notUniqueList.contains(val);
    }
}
