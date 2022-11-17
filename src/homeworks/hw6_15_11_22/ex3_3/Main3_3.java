package homeworks.hw6_15_11_22.ex3_3;

import java.util.ArrayList;
import java.util.List;

public class Main3_3 {
    public static void main(String[] args) {
        List<String> listName = new ArrayList<>();
        listName.add("Mike");
        listName.add(null);
        listName.add("Jho");
        listName.add(null);
        listName.add("Andrew");
        listName.add("Den");
        listName.add(null);
        listName.add("Ken");
        task3_3(listName, listName.size());
    }

    public static void task3_3(List<String> list, int i) {
        if (i > 0) {
            task3_3(list, --i);
            if (list.get(i) != null) {
                System.out.println(list.get(i));
            }
        }
    }
}
