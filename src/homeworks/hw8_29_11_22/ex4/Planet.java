package homeworks.hw8_29_11_22.ex4;

import java.util.ArrayList;
import java.util.List;

public class Planet {
    private PlanetName planetName;
    private List<Parcel> deliveryParcel = new ArrayList<>();

    public Planet(PlanetName planetName) {
        this.planetName = planetName;
    }

    public void addDeliveryParcel(String parcel) {
        deliveryParcel.add(new Parcel(parcel));
    }

    public void printAllDeliveryParcels() {
        System.out.println("Planet name: " + planetName);
        System.out.println("Список доставленных посылок: ");
        for (Parcel listParcel : deliveryParcel) {
            System.out.println(listParcel);
        }
        System.out.println();
    }
}
