package homeworks.hw8_29_11_22.ex4;

public class Parcel {
    // содержимое посылки
    private final String PARCEL_NAME;

    public Parcel(String parcelName) {
        this.PARCEL_NAME = parcelName;
    }

    @Override
    public String toString() {
        return PARCEL_NAME;
    }
}
