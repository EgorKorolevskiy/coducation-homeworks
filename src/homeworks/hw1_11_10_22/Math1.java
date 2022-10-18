package homeworks.hw1_11_10_22;

public class Math1 {

    public static byte abs(byte a) {
        return (a < 0) ? (byte) -a : a;
    }

    public static short abs(short a) {
        return (a < 0) ? (short) -a : a;
    }

    public static int abs(int a) {
        return (a < 0) ? -a : a;
    }

    public static long abs(long a) {
        return (a < 0) ? -a : a;
    }

    public static byte pow(byte val, byte pow) {
        byte result = 1;
        for (int i = 1; i <= pow; i++) {
            result = (byte) (result * val);
        }
        return result;
    }

    public static short pow(short val, short pow) {
        int result = 1;
        for (int i = 1; i <= pow; i++) {
            result = result * val;
        }
        return (short) result;
    }

    public static int pow(int val, int pow) {
        int result = 1;
        for (int i = 1; i <= pow; i++) {
            result = result * val;
        }
        return result;
    }

    public static long pow(long val, long pow) {
        long result = 1;
        for (int i = 1; i <= pow; i++) {
            result = result * val;
        }
        return result;
    }
}
