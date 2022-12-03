package homeworks.hw8_29_11_22.ex4;

public enum PlanetName {
    MERCURY("МЕРКУРИЙ"), VENUS("ВЕНЕРА"), EARTH("ЗЕМЛЯ"), MARS("МАРС"),
    JUPITER("ЮПИТЕР"), SATURN("САТУРН"), URANUS("УРАН"), NEPTUNE("НЕПТУН");

    String psevdonim;

    static boolean isEnglish = true;

    PlanetName(String psevdonim) {
        this.psevdonim = psevdonim;
    }

    public static PlanetName myValueOf(String planet) {
        PlanetName[] values = values();
        for (PlanetName planets : values) {
            if (planets.name().equalsIgnoreCase(planet) || planets.psevdonim.equalsIgnoreCase(planet)) {
                return planets;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        if(isEnglish) {
            return name();
        } else {
            return psevdonim;
        }
    }
}
