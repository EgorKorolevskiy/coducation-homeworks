package homeworks.hw6_15_11_22.ex1;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8,};
        show(array, 0);
    }

    public static void show(int[] array, int i) {
        if (i < array.length) {
            System.out.println(array[i]);
            System.out.println(i);
            show(array, ++i);
        }
    }
}
