package homeworks.hw12_27_22_comparable_comparator.ex4;

import java.util.Comparator;

class SortByNaturalOrder implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}
