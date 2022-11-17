package homeworks.hw6_15_11_22.ex3_1;

import java.util.ArrayList;
import java.util.List;

public class Main3_1 {
    public static void main(String[] args) {
        List<String> listName = new ArrayList<>();
        listName.add(null);
        listName.add("Jho");
        listName.add(null);
        listName.add("Andrew");
        listName.add("Den");
        listName.add(null);
        task4(listName, 0);
    }

    public static void task4(List<String> list, int i) {
        if (i < list.size()) {
            if (list.get(i) != null) {
                System.out.println(list.get(i));
            }
            task4(list, i+1);
        }
    }
}
