package homeworks.hw6_15_11_22.ex3_2;

import java.util.ArrayList;
import java.util.List;

public class Main3_2 {
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
        task3_2(listName, listName.size() - 1);
    }
    public static void task3_2(List<String> list, int i) {
        if (i >= 0) {
            if (list.get(i) != null) {
                System.out.println(list.get(i));
            }
            task3_2(list, --i);
        }
    }
}
