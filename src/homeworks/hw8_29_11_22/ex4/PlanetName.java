package homeworks.hw8_29_11_22.ex4;

public enum PlanetName {
    MERCURY("МЕРКУРИЙ"), VENUS("ВЕНЕРА"), EARTH("ЗЕМЛЯ"), MARS("МАРС"),
    JUPITER("ЮПИТЕР"), SATURN("САТУРН"), URANUS("УРАН"), NEPTUNE("НЕПТУН");

    final String PSEVDONIM;

    static boolean isEnglish = true;

    PlanetName(String psevdonim) {
        this.PSEVDONIM = psevdonim;
    }

    public static PlanetName myValueOf(String planet) {
        PlanetName[] values = values();
        for (PlanetName planets : values) {
            if (planets.name().equalsIgnoreCase(planet) || planets.PSEVDONIM.equalsIgnoreCase(planet)) {
                return planets;
            }
        }
        throw new RuntimeException("Неизвестная планета");
    }

    @Override
    public String toString() {
        if (isEnglish) {
            return name();
        }
        return PSEVDONIM;
    }
}
