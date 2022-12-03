package homeworks.hw8_29_11_22.ex4;

public class Parcel {
    // содержимое посылки
    private String parcelName;

    public Parcel(String parcelName) {
        this.parcelName = parcelName;
    }

    @Override
    public String toString() {
        return parcelName;
    }
}
