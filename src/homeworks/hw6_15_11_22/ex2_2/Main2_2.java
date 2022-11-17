package homeworks.hw6_15_11_22.ex2_2;

public class Main2_2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        task3(array, 0);
    }

    public static void task3(int[] array, int i) {
        if (i < array.length) {
            task3(array, i + 1);
            System.out.println(array[i]);
        }
    }
}
