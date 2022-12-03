package homeworks.hw8_29_11_22.ex4;

import input.Input;

import java.util.ArrayList;
import java.util.List;

public class PlanetService {
    private List<Planet> listPlanet = new ArrayList<>();
    private List<Parcel> listOfParcels = new ArrayList<>();

    {
        listOfParcels.add(new Parcel("Защитный костюм"));
        listOfParcels.add(new Parcel("Кислородная маска"));
        listOfParcels.add(new Parcel("Космический шаттл"));
        listOfParcels.add(new Parcel("Детали для ремонта космо базы"));
        listOfParcels.add(new Parcel("Пять тонн зерна"));
        listOfParcels.add(new Parcel("Прыжковый двигатель"));
        listOfParcels.add(new Parcel("Солнечные панели"));
        listOfParcels.add(new Parcel("Генератор кислорода"));

    }

    public void start() {
        System.out.println("Enter e for english or r for russian");
        String answer = Input.next();

        if (answer.equalsIgnoreCase("e")) {
            PlanetName.isEnglish = true;
        } else {
            PlanetName.isEnglish = false;
        }
        for (int i = 0; i < listOfParcels.size(); i++) {
            System.out.println("Капитан! У нас есть еще недоставленная посылка: " + listOfParcels.get(i) +
                    "\nНа какую планету ее доставить?");
            String userInput = Input.next();
            PlanetName certainPlanet = PlanetName.myValueOf(userInput);
            if (userInput != null) {
                Planet planet = new Planet(certainPlanet);
                planet.addDeliveryParcel(String.valueOf(listOfParcels.get(i)));
                System.out.println("Посылка " + listOfParcels.get(i) + " отправлена на планету " + certainPlanet + "\n");
                listPlanet.add(planet);
                listOfParcels.remove(i--);
            }
        }
        System.out.println("Все посылки доставлены\n");
        showDeliveredParcelsByPlanet();
    }

    public void showDeliveredParcelsByPlanet() {
        System.out.println("------------Список доставленных посылок по планетам------------");
        for (Planet planet : listPlanet) {
            planet.printAllDeliveryParcels();
        }
    }
}
