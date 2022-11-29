package homeworks.hw6_15_11_22.ex5;

public class Main5 {
    public static void main(String[] args) {
        task5(5, 0);
    }
    public static void task5(int n, int i) {
        String znak = "#";
        if (n < 2) {
            System.out.printf("%s", "Треугольник не может быть меньше двух!");
        } else if (i < 1){
            System.out.println(znak);
            task5(n, ++i);
        } else if (i < 2) {
            System.out.println(znak + znak);
            task5(n, ++i);
        } else if (i < n) {
            int j = (n - i) + 1;
            System.out.print(znak);
            printProbel(j, n);
            System.out.print(znak);
            System.out.println();
            task5(n, ++i);
        }
    }

    public static void printProbel(int j, int n) {
        String s = " ";
        while (j < n) {
            System.out.print(s);
            j++;
        }
    }
}
