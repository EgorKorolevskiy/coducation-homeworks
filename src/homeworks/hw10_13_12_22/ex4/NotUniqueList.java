package homeworks.hw10_13_12_22.ex4;

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
        return notUniqueList.get(index);
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
