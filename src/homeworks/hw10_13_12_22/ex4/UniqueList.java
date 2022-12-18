package homeworks.hw10_13_12_22.ex4;

import java.util.ArrayList;
import java.util.List;

public class UniqueList implements MyList {
    List<Integer> uniqueList = new ArrayList<>();


    @Override
    public void add(int val) {
        if (uniqueList.contains(val)) {
            System.out.println("Элемент уже есть в списке! Введите другой элемент");
            return;
        }
        uniqueList.add(val);
    }

    @Override
    public int get(int index) {
        return uniqueList.get(index);
    }

    @Override
    public int size() {
        return uniqueList.size();
    }

    @Override
    public boolean contains(int val) {
        return uniqueList.contains(val);
    }
}
