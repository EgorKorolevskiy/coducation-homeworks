package homeworks.hw12_27_22_comparable_comparator.ex3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(2);
        list.add(10);
        list.add(7);

        list.sort(Comparator.reverseOrder());
        list.sort((o1, o2) -> {
            if (o1 % 2 == 0) {
                return o1 - o2;
            }
            return o2 - o1;
        });
        System.out.println(list);
//        [2, 4, 6, 8, 10, 9, 7, 5, 3, 1]
    }
}