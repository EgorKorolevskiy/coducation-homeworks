package homeworks.hw12_27_22_comparable_comparator.ex1;

public class Planet implements Comparable<Planet> {
    private String name;
    private double diameter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public Planet(String name, double diameter) {
        this.name = name;
        this.diameter = diameter;
    }

    @Override
    public int compareTo(Planet o) {
        return (int) getDiameter() - (int) o.getDiameter();
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
