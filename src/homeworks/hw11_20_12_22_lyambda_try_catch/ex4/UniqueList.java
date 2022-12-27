package homeworks.hw11_20_12_22_lyambda_try_catch.ex4;

import java.util.ArrayList;
import java.util.List;

public class UniqueList implements MyList {
    List<Integer> uniqueList = new ArrayList<>();


//    @Override
//    public void add(int val) {
//        try {
//            if (uniqueList.contains(val)) {
//                throw new DublicateItemException("Вы не можете добавить дубликат!");
//            }
//            uniqueList.add(val);
//        } catch (DublicateItemException e) {
//            e.printStackTrace();
//        }
//    }

    @Override
    public void add(int val) {
        if (uniqueList.contains(val)) {
            throw new DublicateItemException("Вы не можете добавить дубликат!");
        }
        uniqueList.add(val);
    }


    @Override
    public int get(int index) {
        try {
            return uniqueList.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Индекс не найден!");
            e.printStackTrace();
        }
        return 0;
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

class DublicateItemException extends RuntimeException {
    public DublicateItemException(String message) {
        super(message);
    }
}
