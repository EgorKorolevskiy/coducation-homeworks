package homeworks.hw6_15_11_22.ex2_1;

public class Main2_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        task2(array, array.length - 1);
    }

    public static void task2(int[] array,int i) {
        if (i >= 0) {
            if (array.length > 0) {
                System.out.println(array[i]);
                task2(array, i - 1);
            }
        }
    }
}
