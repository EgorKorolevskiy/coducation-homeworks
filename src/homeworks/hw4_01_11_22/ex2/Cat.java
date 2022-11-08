package homeworks.hw4_01_11_22.ex2;

import java.util.Objects;

public class Cat {
    private String nameCat;
    private int weightCat;
    private String colorCat;

    public Cat(String nameCat, int weightCat, String colorCat) {
        this.nameCat = nameCat;
        this.weightCat = weightCat;
        this.colorCat = colorCat;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public int getWeightCat() {
        return weightCat;
    }

    public void setWeightCat(int weightCat) {
        this.weightCat = weightCat;
    }

    public String getColorCat() {
        return colorCat;
    }

    public void setColorCat(String colorCat) {
        this.colorCat = colorCat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return nameCat.equals(cat.nameCat) && colorCat.equals(cat.colorCat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCat, weightCat, colorCat);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nameCat='" + nameCat + '\'' +
                ", weightCat=" + weightCat +
                ", colorCat='" + colorCat + '\'' +
                '}';
    }
}
