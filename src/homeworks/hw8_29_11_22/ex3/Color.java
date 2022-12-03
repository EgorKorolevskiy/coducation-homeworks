package homeworks.hw8_29_11_22.ex3;

public enum Color {
    WHITE, BLUE, RED, GREEN;

    public static Color colorValueOf(String color) {
        Color[] values = values();
        for (Color colors : values) {
            if (colors.name().equalsIgnoreCase(color)) {
                return colors;
            }
        }
        return null;
    }
}
