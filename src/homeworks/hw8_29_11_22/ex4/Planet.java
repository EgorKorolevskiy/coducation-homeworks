package homeworks.hw8_29_11_22.ex4;

import java.util.ArrayList;
import java.util.List;

public class Planet {
    private final PlanetName PLANET_NAME;
    private final List<Parcel> DELIVERY_PARCEL = new ArrayList<>();

    public Planet(PlanetName planetName) {
        this.PLANET_NAME = planetName;
    }

    public void addDeliveryParcel(Parcel parcel) {
        DELIVERY_PARCEL.add(parcel);
    }

    public void printAllDeliveryParcels() {
        System.out.println("Planet name: " + PLANET_NAME);
        System.out.println("Список доставленных посылок: ");
        for (Parcel listParcel : DELIVERY_PARCEL) {
            System.out.println(listParcel);
        }
        System.out.println();
    }
}
