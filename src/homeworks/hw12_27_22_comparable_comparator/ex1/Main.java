package homeworks.hw12_27_22_comparable_comparator.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Planet> listPlanet = new ArrayList<>();

        listPlanet.add(new Planet("Merkuriy", 10.2));
        listPlanet.add(new Planet("Jupiter", 20.4));
        listPlanet.add(new Planet("Earth", 12.5));
        listPlanet.add(new Planet("Saturn", 25.2));
        listPlanet.add(new Planet("Mars", 14.1));
        listPlanet.add(new Planet("Venus", 11));

        listPlanet.sort(null);
        System.out.println(listPlanet);
    }
}
