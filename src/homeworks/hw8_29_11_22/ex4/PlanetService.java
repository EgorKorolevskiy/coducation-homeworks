package homeworks.hw8_29_11_22.ex4;

import input.Input;

import java.util.ArrayList;
import java.util.List;

public class PlanetService {
    private final List<Planet> LIST_PLANET = new ArrayList<>();
    private final List<Parcel> LIST_OF_PARCEL = new ArrayList<>();

    {
        LIST_OF_PARCEL.add(new Parcel("Защитный костюм"));
        LIST_OF_PARCEL.add(new Parcel("Кислородная маска"));
        LIST_OF_PARCEL.add(new Parcel("Космический шаттл"));
        LIST_OF_PARCEL.add(new Parcel("Детали для ремонта космо базы"));
        LIST_OF_PARCEL.add(new Parcel("Пять тонн зерна"));
        LIST_OF_PARCEL.add(new Parcel("Прыжковый двигатель"));
        LIST_OF_PARCEL.add(new Parcel("Солнечные панели"));
        LIST_OF_PARCEL.add(new Parcel("Генератор кислорода"));

    }


    public void start() {
        System.out.println("Enter e for english or r for russian");
        initLanguage();
        for (int i = 0; i < LIST_OF_PARCEL.size(); i++) {
            System.out.printf("Капитан! У нас есть еще недоставленная посылка: %s\nНа какую планету ее доставить?\n", LIST_OF_PARCEL.get(i));
            String userInput = Input.next();
            PlanetName certainPlanet = PlanetName.myValueOf(userInput);
            if (userInput != null) {
                Planet planet = new Planet(certainPlanet);
                planet.addDeliveryParcel(LIST_OF_PARCEL.get(i));
                System.out.printf("Посылка %s отправлена на планету %s\n", LIST_OF_PARCEL.get(i), certainPlanet);
                LIST_PLANET.add(planet);
                LIST_OF_PARCEL.remove(i--);
            }
        }
        System.out.println("Все посылки доставлены\n");
        showDeliveredParcelsByPlanet();
    }

    private void initLanguage() {
        String answer = Input.next();

        PlanetName.isEnglish = answer.equalsIgnoreCase("e");
    }

    private void showDeliveredParcelsByPlanet() {
        System.out.println("------------Список доставленных посылок по планетам------------");
        for (Planet planet : LIST_PLANET) {
            planet.printAllDeliveryParcels();
        }
    }
}
