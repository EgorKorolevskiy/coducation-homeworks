package homeworks.hw5_08_11_22.ex1;

public class MyMath {
    public static final double PI = 3.14;

    public static double pow(double val, int stepen) {
        double result = 1;
        for (int i = 1; i <= stepen; i++) {
            result = result * val;
        }
        return result;
    }

    public static double abs(double val) {
        return (val < 0) ? -val : val;
    }

    public static double getCircleSquare(double r) {
        return 2 * PI * r;
    }
}
